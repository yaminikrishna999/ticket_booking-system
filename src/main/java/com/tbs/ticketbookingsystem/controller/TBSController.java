package com.tbs.ticketbookingsystem.controller;

import com.tbs.ticketbookingsystem.model.movie.MovieInfo;
import com.tbs.ticketbookingsystem.model.request.ViewAvailableSeatsRequest;
import com.tbs.ticketbookingsystem.model.request.ViewMoviesInACityRequest;
import com.tbs.ticketbookingsystem.model.request.ViewTheatersRequest;
import com.tbs.ticketbookingsystem.model.theater.SeatsItem;
import com.tbs.ticketbookingsystem.model.theater.TheaterInfo;
import com.tbs.ticketbookingsystem.service.MovieService;
import com.tbs.ticketbookingsystem.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * @author : Yamini Krishna
 * @date 16/11/21 9:17 PM
 */
@RestController
public class TBSController {

    @Autowired
    MovieService movieService;

    @Autowired
    TheaterService theaterService;

    @RequestMapping(value = "/tbs/v1/view-movies-in-your-city", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Object> viewAllMoviesInACity(@RequestBody ViewMoviesInACityRequest viewMoviesInACityRequest) {
        List<MovieInfo> movieInfoList = new ArrayList<>();
        try {
            movieInfoList = movieService.getMoviesInACity(viewMoviesInACityRequest.getSelectedCity());
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return new ResponseEntity<Object>(movieInfoList, HttpStatus.OK);
    }

    @RequestMapping(value = "/tbs/v1/view-theaters-in-which-movie-is-playing", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Object> viewAllTheatersInWhichMovieIsPlaying(@RequestBody ViewTheatersRequest viewTheatersRequest) {
        List<TheaterInfo> theaterInfoList = new ArrayList<>();
        try {
            theaterInfoList = theaterService.getTheatersInWhichMovieIsPlaying(viewTheatersRequest.getSelectedCity(), viewTheatersRequest.getMovieId());
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return new ResponseEntity<Object>(theaterInfoList, HttpStatus.OK);
    }

    @RequestMapping(value = "/tbs/v1/view-available-seats", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Object> viewAvailableSeats(@RequestBody ViewAvailableSeatsRequest viewAvailableSeatsRequest) {
        List<SeatsItem> seatsItemList = new ArrayList<>();
        try {
            seatsItemList = theaterService.getAvailableSeats(viewAvailableSeatsRequest.getTheaterId(),
                    viewAvailableSeatsRequest.getSelectedCity(),
                    viewAvailableSeatsRequest.getMovieId(),
                    viewAvailableSeatsRequest.getDay(),
                    viewAvailableSeatsRequest.getShowStartTime()
                    );
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return new ResponseEntity<Object>(seatsItemList, HttpStatus.OK);
    }

}
