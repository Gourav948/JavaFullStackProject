package com.spring.json;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

 

public class Reservation 
{ 
	private long reservationId;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private UserProfile  userProfileEntity;
	
	@ManyToOne(cascade=CascadeType.ALL) 
	private Vehicle  vehicleEntity;
	
	@ManyToOne(cascade=CascadeType.ALL) 
	private Route  routeEntity; 
	
	private LocalDate  bookingDate; 
	
	private LocalDate journeyDate;
	
	@OneToOne(cascade=CascadeType.ALL) 
	private Driver driverEntity; 
	
	private String bookingStatus;
 
	private int totalFare;
	 
	private String boardingPoint;
	 
	private String dropPoint;
		
	 
	
	public Reservation() {
		super();
		 
	}

	

	public Reservation(long reservationId, UserProfile userProfileEntity, Vehicle vehicleEntity,
			Route routeEntity, LocalDate bookingDate, LocalDate journeyDate, Driver driverEntity,
			String bookingStatus, int totalFare, String boardingPoint, String dropPoint) {
		super();
		this.reservationId = reservationId;
		this.userProfileEntity = userProfileEntity;
		this.vehicleEntity = vehicleEntity;
		this.routeEntity = routeEntity;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.driverEntity = driverEntity;
		this.bookingStatus = bookingStatus;
		this.totalFare = totalFare;
		this.boardingPoint = boardingPoint;
		this.dropPoint = dropPoint;
	}



	public long getReservationId() {
		return reservationId;
	}



	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}



	public UserProfile getUserProfileEntity() {
		return userProfileEntity;
	}



	public void setUserProfileEntity(UserProfile userProfileEntity) {
		this.userProfileEntity = userProfileEntity;
	}



	public Vehicle getVehicleEntity() {
		return vehicleEntity;
	}



	public void setVehicleEntity(Vehicle vehicleEntity) {
		this.vehicleEntity = vehicleEntity;
	}



	public Route getRouteEntity() {
		return routeEntity;
	}



	public void setRouteEntity(Route routeEntity) {
		this.routeEntity = routeEntity;
	}



	public LocalDate getBookingDate() {
		return bookingDate;
	}



	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}



	public LocalDate getJourneyDate() {
		return journeyDate;
	}



	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}



	public Driver getDriverEntity() {
		return driverEntity;
	}



	public void setDriverEntity(Driver driverEntity) {
		this.driverEntity = driverEntity;
	}



	public String getBookingStatus() {
		return bookingStatus;
	}



	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}



	public int getTotalFare() {
		return totalFare;
	}



	public void setTotalFare(int totalFare) {
		this.totalFare = totalFare;
	}



	public String getBoardingPoint() {
		return boardingPoint;
	}



	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}



	public String getDropPoint() {
		return dropPoint;
	}



	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}



	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", userProfileEntity=" + userProfileEntity
				+ ", vehicleEntity=" + vehicleEntity + ", routeEntity=" + routeEntity + ", bookingDate=" + bookingDate
				+ ", journeyDate=" + journeyDate + ", driverEntity=" + driverEntity + ", bookingStatus=" + bookingStatus
				+ ", totalFare=" + totalFare + ", boardingPoint=" + boardingPoint + ", dropPoint=" + dropPoint + "]";
	}
	
	
	
	
}
