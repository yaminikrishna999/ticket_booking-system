package com.tbs.ticketbookingsystem.model.movie;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Metadata{

	@SerializedName("movieDuration")
	private String movieDuration;

	@SerializedName("actors")
	private List<ActorsItem> actors;

	@SerializedName("genre")
	private List<String> genre;

	@SerializedName("about")
	private String about;

	@SerializedName("crew")
	private List<CrewItem> crew;

	public void setActors(List<ActorsItem> actors){
		this.actors = actors;
	}

	public List<ActorsItem> getActors(){
		return actors;
	}

	public void setGenre(List<String> genre){
		this.genre = genre;
	}

	public List<String> getGenre(){
		return genre;
	}

	public void setAbout(String about){
		this.about = about;
	}

	public String getAbout(){
		return about;
	}

	public void setCrew(List<CrewItem> crew){
		this.crew = crew;
	}

	public List<CrewItem> getCrew(){
		return crew;
	}

	public String getMovieDuration() {
		return movieDuration;
	}

	public void setMovieDuration(String movieDuration) {
		this.movieDuration = movieDuration;
	}
}