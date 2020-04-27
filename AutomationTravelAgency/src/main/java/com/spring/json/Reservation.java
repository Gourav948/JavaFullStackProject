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

 

public class Reservation 
{ 
	private long reservationId;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<UserCredentials>  userCredentialsEntity;
	
	@OneToMany(cascade=CascadeType.ALL) 
	private List<Vehicle>  vehicleEntity;
	
	@OneToMany(cascade=CascadeType.ALL) 
	private List<Route>  routeEntity; 
	
	private LocalDate  bookingDate; 
	
	private LocalDate journeyDate;
	
	@OneToMany(cascade=CascadeType.ALL) 
	private List<Driver> driverEntity; 
	
	private String bookingStatus;
 
	private int totalFare;
	 
	private String boardingPoint;
	 
	private String dropPoint;
		
	 
	
	public Reservation() {
		super();
		 
	}

	

	public Reservation(long reservationId, List<UserCredentials> userCredentialsEntity, List<Vehicle> vehicleEntity,
			List<Route> routeEntity, LocalDate bookingDate, LocalDate journeyDate, List<Driver> driverEntity,
			String bookingStatus, int totalFare, String boardingPoint, String dropPoint) {
		super();
		this.reservationId = reservationId;
		this.userCredentialsEntity = userCredentialsEntity;
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



	public List<UserCredentials> getUserCredentialsEntity() {
		return userCredentialsEntity;
	}



	public void setUserCredentialsEntity(List<UserCredentials> userCredentialsEntity) {
		this.userCredentialsEntity = userCredentialsEntity;
	}



	public List<Vehicle> getVehicleEntity() {
		return vehicleEntity;
	}



	public void setVehicleEntity(List<Vehicle> vehicleEntity) {
		this.vehicleEntity = vehicleEntity;
	}



	public List<Route> getRouteEntity() {
		return routeEntity;
	}



	public void setRouteEntity(List<Route> routeEntity) {
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



	public List<Driver> getDriverEntity() {
		return driverEntity;
	}



	public void setDriverEntity(List<Driver> driverEntity) {
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
		return "Reservation [reservationId=" + reservationId + ", userCredentialsEntity=" + userCredentialsEntity
				+ ", vehicleEntity=" + vehicleEntity + ", routeEntity=" + routeEntity + ", bookingDate=" + bookingDate
				+ ", journeyDate=" + journeyDate + ", driverEntity=" + driverEntity + ", bookingStatus=" + bookingStatus
				+ ", totalFare=" + totalFare + ", boardingPoint=" + boardingPoint + ", dropPoint=" + dropPoint + "]";
	}
	
	
	
	
}
