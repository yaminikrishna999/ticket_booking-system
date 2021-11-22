package com.tbs.ticketbookingsystem.model.movie;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MovieInfo{

	@SerializedName("metadata")
	private Metadata metadata;

	@SerializedName("locations")
	private List<LocationsItem> locations;

	@SerializedName("movieTitle")
	private String movieTitle;

	@SerializedName("movieId")
	private String movieId;

	public void setMetadata(Metadata metadata){
		this.metadata = metadata;
	}

	public Metadata getMetadata(){
		return metadata;
	}

	public void setLocations(List<LocationsItem> locations){
		this.locations = locations;
	}

	public List<LocationsItem> getLocations(){
		return locations;
	}

	public void setMovieTitle(String movieTitle){
		this.movieTitle = movieTitle;
	}

	public String getMovieTitle(){
		return movieTitle;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
}