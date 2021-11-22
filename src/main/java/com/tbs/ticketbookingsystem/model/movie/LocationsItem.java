package com.tbs.ticketbookingsystem.model.movie;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class LocationsItem{

	@SerializedName("country")
	private String country;

	@SerializedName("city")
	private String city;

	@SerializedName("theaters")
	private List<TheatersItem> theaters;

	@SerializedName("latitude")
	private double latitude;

	@SerializedName("state")
	private String state;

	@SerializedName("longitude")
	private double longitude;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setTheaters(List<TheatersItem> theaters){
		this.theaters = theaters;
	}

	public List<TheatersItem> getTheaters(){
		return theaters;
	}

	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLatitude(){
		return latitude;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}
}