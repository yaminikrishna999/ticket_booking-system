package com.tbs.ticketbookingsystem.model.request;

import com.google.gson.annotations.SerializedName;

public class ViewAvailableSeatsRequest{

	@SerializedName("theaterId")
	private String theaterId;

	@SerializedName("selectedCity")
	private String selectedCity;

	@SerializedName("showStartTime")
	private String showStartTime;

	@SerializedName("movieId")
	private String movieId;

	@SerializedName("day")
	private String day;

	public String getSelectedCity() {
		return selectedCity;
	}

	public void setSelectedCity(String selectedCity) {
		this.selectedCity = selectedCity;
	}

	public void setTheaterId(String theaterId){
		this.theaterId = theaterId;
	}

	public String getTheaterId(){
		return theaterId;
	}

	public void setShowStartTime(String showStartTime){
		this.showStartTime = showStartTime;
	}

	public String getShowStartTime(){
		return showStartTime;
	}

	public void setMovieId(String movieId){
		this.movieId = movieId;
	}

	public String getMovieId(){
		return movieId;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	@Override
 	public String toString(){
		return 
			"ViewAvailableSeatsRequest{" + 
			"theaterId = '" + theaterId + '\'' + 
			",showTime = '" + showStartTime + '\'' +
			",movieId = '" + movieId + '\'' + 
			",day = '" + day + '\'' + 
			"}";
		}
}