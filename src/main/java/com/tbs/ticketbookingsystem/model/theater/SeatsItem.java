package com.tbs.ticketbookingsystem.model.theater;

import com.google.gson.annotations.SerializedName;

public class SeatsItem{

	@SerializedName("isAvailable")
	private boolean isAvailable;

	@SerializedName("seatId")
	private String seatId;

	@SerializedName("seatNo")
	private String seatNo;

	public void setIsAvailable(boolean isAvailable){
		this.isAvailable = isAvailable;
	}

	public boolean isIsAvailable(){
		return isAvailable;
	}

	public void setSeatId(String seatId){
		this.seatId = seatId;
	}

	public String getSeatId(){
		return seatId;
	}

	public void setSeatNo(String seatNo){
		this.seatNo = seatNo;
	}

	public String getSeatNo(){
		return seatNo;
	}

	@Override
 	public String toString(){
		return 
			"SeatsItem{" + 
			"isAvailable = '" + isAvailable + '\'' + 
			",seatId = '" + seatId + '\'' + 
			",seatNo = '" + seatNo + '\'' + 
			"}";
		}
}