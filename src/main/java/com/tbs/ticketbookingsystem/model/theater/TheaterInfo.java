package com.tbs.ticketbookingsystem.model.theater;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TheaterInfo{

	@SerializedName("area")
	private String area;

	@SerializedName("city")
	private String city;

	@SerializedName("showTimes")
	private List<ShowTimesItem> showTimes;

	@SerializedName("theaterId")
	private String theaterId;

	@SerializedName("name")
	private String name;

	@SerializedName("seatingCapacity")
	private int seatingCapacity;

	public void setArea(String area){
		this.area = area;
	}

	public String getArea(){
		return area;
	}

	public void setShowTimes(List<ShowTimesItem> showTimes){
		this.showTimes = showTimes;
	}

	public List<ShowTimesItem> getShowTimes(){
		return showTimes;
	}

	public void setTheaterId(String theaterId){
		this.theaterId = theaterId;
	}

	public String getTheaterId(){
		return theaterId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setSeatingCapacity(int seatingCapacity){
		this.seatingCapacity = seatingCapacity;
	}

	public int getSeatingCapacity(){
		return seatingCapacity;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
 	public String toString(){
		return 
			"TheaterInfo{" + 
			"area = '" + area + '\'' + 
			",showTimes = '" + showTimes + '\'' + 
			",theaterId = '" + theaterId + '\'' + 
			",name = '" + name + '\'' + 
			",seatingCapacity = '" + seatingCapacity + '\'' + 
			"}";
		}
}