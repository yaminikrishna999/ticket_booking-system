package com.tbs.ticketbookingsystem.model.movie;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MovieList{

	@SerializedName("movieList")
	private List<MovieInfo> movieList;

	public void setMovieList(List<MovieInfo> movieList){
		this.movieList = movieList;
	}

	public List<MovieInfo> getMovieList(){
		return movieList;
	}

	@Override
 	public String toString(){
		return 
			"MovieList{" + 
			"movieList = '" + movieList + '\'' + 
			"}";
		}
}