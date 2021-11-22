package com.tbs.ticketbookingsystem.model.movie;

import com.google.gson.annotations.SerializedName;

public class ActorsItem{

	@SerializedName("role")
	private String role;

	@SerializedName("name")
	private String name;

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}