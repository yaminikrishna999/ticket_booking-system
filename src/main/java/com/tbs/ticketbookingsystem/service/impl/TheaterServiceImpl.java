package com.tbs.ticketbookingsystem.service.impl;

import com.google.gson.Gson;
import com.tbs.ticketbookingsystem.model.theater.*;
import com.tbs.ticketbookingsystem.service.TheaterService;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : pavankalyankillari
 * @date 20/11/21 2:11 PM
 */
@Component
public class TheaterServiceImpl implements TheaterService {
    @Override
    public List<TheaterInfo> getTheatersInWhichMovieIsPlaying(String city, String movieId) throws IOException {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        List<TheaterInfo> result = new ArrayList<>();
//        todo: Need to get the movieInfo from the database, temporarily getting data from file
        try (FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/com/tbs/ticketbookingsystem/utils/theatersInfo.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            String jsonString = obj.toString();
            Gson gson = new Gson();
            TheatersList theatersList = gson.fromJson(jsonString, TheatersList.class);

            for (TheaterInfo theaterInfo : theatersList.getTheatersList()) {
                if (theaterInfo.getCity() != null && theaterInfo.getCity().equalsIgnoreCase(city)) {
                    for (ShowTimesItem showTime : theaterInfo.getShowTimes()) {
                        if (showTime.getMovieId().equalsIgnoreCase(movieId)) {
                            result.add(theaterInfo);
                            break;
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

    @Override
    public List<SeatsItem> getAvailableSeats(String theaterId, String city, String movieId, String day, String showStartTime) throws IOException {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        List<SeatsItem> result = new ArrayList<>();
//        todo: Need to get the movieInfo from the database, temporarily getting data from file
        try (FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/com/tbs/ticketbookingsystem/utils/theatersInfo.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            String jsonString = obj.toString();
            Gson gson = new Gson();
            TheatersList theatersList = gson.fromJson(jsonString, TheatersList.class);

            for (TheaterInfo theaterInfo : theatersList.getTheatersList()) {
                if (theaterInfo.getCity() != null && theaterInfo.getCity().equalsIgnoreCase(city)) {
                    for (ShowTimesItem showTime : theaterInfo.getShowTimes()) {
                        if (showTime.getMovieId().equalsIgnoreCase(movieId) && showTime.getDay().equalsIgnoreCase(day)) {
                            for (ShowInfo showInfo : showTime.getShowInfo()) {
                                if (showInfo.getShowStartTime().equalsIgnoreCase(showStartTime)) {
                                    result = showInfo.getSeats();
                                    return result;
                                }
                            }
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
