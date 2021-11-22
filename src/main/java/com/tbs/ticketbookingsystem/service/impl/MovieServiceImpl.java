package com.tbs.ticketbookingsystem.service.impl;

import com.google.gson.Gson;
import com.tbs.ticketbookingsystem.model.movie.LocationsItem;
import com.tbs.ticketbookingsystem.model.movie.MovieInfo;
import com.tbs.ticketbookingsystem.model.movie.MovieList;
import com.tbs.ticketbookingsystem.service.MovieService;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Yamini Krishna
 * @date 16/11/21 9:25 PM
 */
@Component
public class MovieServiceImpl implements MovieService {

    @Override
    public List<MovieInfo> getMoviesInACity(String city) throws IOException {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        List<MovieInfo> result = new ArrayList<>();
//        todo: Need to get the movieInfo from the database, temporarily getting data from file
        try (FileReader reader = new FileReader(System.getProperty("user.dir")+"/src/main/java/com/tbs/ticketbookingsystem/utils/moviesInfo.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            String jsonString = obj.toString();
            Gson gson = new Gson();
            MovieList movieList = gson.fromJson(jsonString, MovieList.class);

            for (MovieInfo movieInfo : movieList.getMovieList()) {
                if (movieInfo.getLocations() != null && !movieInfo.getLocations().isEmpty()) {
                    for (LocationsItem location : movieInfo.getLocations()) {
                        if (location.getCity().equalsIgnoreCase(city)) {
                            result.add(movieInfo);
                        }
                    }
                }

            }
            return result;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


}
