package com.tbs.ticketbookingsystem.model.theater;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TheatersList{

	@SerializedName("theatersList")
	private List<TheaterInfo> theatersList;

	public void setTheatersList(List<TheaterInfo> theatersList){
		this.theatersList = theatersList;
	}

	public List<TheaterInfo> getTheatersList(){
		return theatersList;
	}

	@Override
 	public String toString(){
		return 
			"TheatersList{" + 
			"theatersList = '" + theatersList + '\'' + 
			"}";
		}
}