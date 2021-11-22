package com.tbs.ticketbookingsystem.service;

import com.tbs.ticketbookingsystem.model.movie.MovieInfo;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * @author : Yamini Krishna
 * @date 16/11/21 9:24 PM
 */
@Service
public interface MovieService {

    List<MovieInfo> getMoviesInACity(String city) throws IOException;

}
