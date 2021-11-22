package com.tbs.ticketbookingsystem.model.request;

import com.google.gson.annotations.SerializedName;

public class ViewMoviesInACityRequest {

	@SerializedName("selectedCity")
	private String selectedCity;

	@SerializedName("customerId")
	private String customerId;

	public void setSelectedCity(String selectedCity){
		this.selectedCity = selectedCity;
	}

	public String getSelectedCity(){
		return selectedCity;
	}

	public void setCustomerId(String customerId){
		this.customerId = customerId;
	}

	public String getCustomerId(){
		return customerId;
	}

	@Override
 	public String toString(){
		return 
			"ViewMoviesInACItyRequest{" + 
			"selectedCity = '" + selectedCity + '\'' + 
			",customerId = '" + customerId + '\'' + 
			"}";
		}
}