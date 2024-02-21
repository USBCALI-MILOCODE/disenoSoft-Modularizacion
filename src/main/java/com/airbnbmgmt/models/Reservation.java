package com.airbnbmgmt.models;

import java.sql.Date;

public class Reservation {
	private int reservationId;
	private Guest guest;
	private Host host;
	private Date checkInDate;
	private Date checkOutDate;
	
	public int getReservationId() {
		return reservationId;
	}
	
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	
	public Guest getGuest() {
		return guest;
	}
	
	public void setGuest(Guest guest) {
		this.guest = guest;
	}
	
	public Host getHost() {
		return host;
	}
	
	public void setHost(Host host) {
		this.host = host;
	}
	
	public Date getCheckInDate() {
		return checkInDate;
	}
	
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	
	
	
	
	
}
