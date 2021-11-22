package com.tbs.ticketbookingsystem.model.ticketbooking;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TicketBooking{

	@SerializedName("selectedSeats")
	private List<SelectedSeatsItem> selectedSeats;

	@SerializedName("showTime")
	private String showTime;

	@SerializedName("movieTitle")
	private String movieTitle;

	@SerializedName("theaterName")
	private String theaterName;

	@SerializedName("movieDuration")
	private String movieDuration;

	@SerializedName("bookingId")
	private String bookingId;

	public void setSelectedSeats(List<SelectedSeatsItem> selectedSeats){
		this.selectedSeats = selectedSeats;
	}

	public List<SelectedSeatsItem> getSelectedSeats(){
		return selectedSeats;
	}

	public void setShowTime(String showTime){
		this.showTime = showTime;
	}

	public String getShowTime(){
		return showTime;
	}

	public void setMovieTitle(String movieTitle){
		this.movieTitle = movieTitle;
	}

	public String getMovieTitle(){
		return movieTitle;
	}

	public void setTheaterName(String theaterName){
		this.theaterName = theaterName;
	}

	public String getTheaterName(){
		return theaterName;
	}

	public void setMovieDuration(String movieDuration){
		this.movieDuration = movieDuration;
	}

	public String getMovieDuration(){
		return movieDuration;
	}

	public void setBookingId(String bookingId){
		this.bookingId = bookingId;
	}

	public String getBookingId(){
		return bookingId;
	}

	@Override
 	public String toString(){
		return 
			"TicketBooking{" + 
			"selectedSeats = '" + selectedSeats + '\'' + 
			",showTime = '" + showTime + '\'' + 
			",movieTitle = '" + movieTitle + '\'' + 
			",theaterName = '" + theaterName + '\'' + 
			",movieDuration = '" + movieDuration + '\'' + 
			",bookingId = '" + bookingId + '\'' + 
			"}";
		}
}