package com.tbs.ticketbookingsystem.model.theater;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ShowInfo{

	@SerializedName("showStartTime")
	private String showStartTime;

	@SerializedName("seats")
	private List<SeatsItem> seats;

	public void setShowStartTime(String showStartTime){
		this.showStartTime = showStartTime;
	}

	public String getShowStartTime(){
		return showStartTime;
	}

	public void setSeats(List<SeatsItem> seats){
		this.seats = seats;
	}

	public List<SeatsItem> getSeats(){
		return seats;
	}

	@Override
 	public String toString(){
		return 
			"ShowInfo{" + 
			"showStartTime = '" + showStartTime + '\'' + 
			",seats = '" + seats + '\'' + 
			"}";
		}
}