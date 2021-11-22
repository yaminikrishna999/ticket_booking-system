package com.tbs.ticketbookingsystem.model.ticketbooking;

import com.google.gson.annotations.SerializedName;

public class SelectedSeatsItem{

	@SerializedName("seatNo")
	private String seatNo;

	public void setSeatNo(String seatNo){
		this.seatNo = seatNo;
	}

	public String getSeatNo(){
		return seatNo;
	}

	@Override
 	public String toString(){
		return 
			"SelectedSeatsItem{" + 
			"seatNo = '" + seatNo + '\'' + 
			"}";
		}
}