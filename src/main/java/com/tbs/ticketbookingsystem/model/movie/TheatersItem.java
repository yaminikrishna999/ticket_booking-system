package com.tbs.ticketbookingsystem.model.movie;

import com.google.gson.annotations.SerializedName;

public class TheatersItem{

	@SerializedName("area")
	private String area;

	@SerializedName("name")
	private String name;

	@SerializedName("theaterId")
	private String theaterId;

	public void setArea(String area){
		this.area = area;
	}

	public String getArea(){
		return area;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public String getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(String theaterId) {
		this.theaterId = theaterId;
	}
}