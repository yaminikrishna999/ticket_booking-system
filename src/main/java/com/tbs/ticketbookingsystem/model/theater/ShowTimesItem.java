package com.tbs.ticketbookingsystem.model.theater;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ShowTimesItem {

    @SerializedName("day")
    private String day;

    @SerializedName("movieId")
    private String movieId;

    @SerializedName("showInfo")
    private List<ShowInfo> showInfo;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public List<ShowInfo> getShowInfo() {
        return showInfo;
    }

    public void setShowInfo(List<ShowInfo> showInfo) {
        this.showInfo = showInfo;
    }
}