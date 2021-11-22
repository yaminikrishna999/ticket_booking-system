package com.tbs.ticketbookingsystem.service;

import com.tbs.ticketbookingsystem.model.movie.MovieInfo;
import com.tbs.ticketbookingsystem.model.theater.SeatsItem;
import com.tbs.ticketbookingsystem.model.theater.TheaterInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author : Yamini Krishna
 * @date 16/11/21 9:24 PM
 */
@Service
public interface TheaterService {

    List<TheaterInfo> getTheatersInWhichMovieIsPlaying(String city, String  movieId) throws IOException;

    List<SeatsItem> getAvailableSeats(String theaterId, String city, String movieId, String day, String showTime) throws IOException;

}
