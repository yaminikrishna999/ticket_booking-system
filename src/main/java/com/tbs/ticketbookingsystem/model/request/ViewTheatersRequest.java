package com.tbs.ticketbookingsystem.model.request;

import com.google.gson.annotations.SerializedName;

public class ViewTheatersRequest{

	@SerializedName("selectedCity")
	private String selectedCity;

	@SerializedName("movieId")
	private String movieId;

	public void setSelectedCity(String selectedCity){
		this.selectedCity = selectedCity;
	}

	public String getSelectedCity(){
		return selectedCity;
	}

	public void setMovieId(String movieId){
		this.movieId = movieId;
	}

	public String getMovieId(){
		return movieId;
	}

	@Override
 	public String toString(){
		return 
			"ViewTheatersRequest{" + 
			"city = '" + selectedCity + '\'' +
			",movieId = '" + movieId + '\'' + 
			"}";
		}
}