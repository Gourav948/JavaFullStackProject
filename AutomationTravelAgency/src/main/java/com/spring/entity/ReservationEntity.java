package com.spring.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ATA_TBL_Reservation")
public class ReservationEntity 
{
	@Id
	@GeneratedValue
	@Column(name="RESERVATIONID")
	private long reservationId;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "USERID")
	private UserCredentialsEntity userCredentialsEntity;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "VEHICLEID")
	private List<VehicleEntity> vehicleEntity;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "ROUTEID")
	private List<RouteEntity> routeEntity;
	
	@Column(name="BOOKINGDATE")
	private LocalDate  bookingDate;
	
	@Column(name="JOURNEYDATE")
	private LocalDate journeyDate;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "DRIVERID")
	private List<DriverEntity> driverEntity;
	
	@Column(name="BOOKINGSTATUS")
	private String bookingStatus;
	
	@Column(name="TOTALFARE")
	private int totalFare;
	
	@Column(name="BOARDINGPOINT")
	private String boardingPoint;
	
	@Column(name="DROPPOINT")
	private String dropPoint;
		
	public ReservationEntity() {
		super();
	 
	}
	

	public ReservationEntity(UserCredentialsEntity userCredentialsEntity, List<VehicleEntity> vehicleEntity,
			List<RouteEntity> routeEntity, LocalDate bookingDate, LocalDate journeyDate,
			List<DriverEntity> driverEntity, String bookingStatus, int totalFare, String boardingPoint,
			String dropPoint) {
		super();
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

	public UserCredentialsEntity getUserCredentialsEntity() {
		return userCredentialsEntity;
	}

	public void setUserCredentialsEntity(UserCredentialsEntity userCredentialsEntity) {
		this.userCredentialsEntity = userCredentialsEntity;
	}

	public List<VehicleEntity> getVehicleEntity() {
		return vehicleEntity;
	}

	public void setVehicleEntity(List<VehicleEntity> vehicleEntity) {
		this.vehicleEntity = vehicleEntity;
	}

	public List<RouteEntity> getRouteEntity() {
		return routeEntity;
	}

	public void setRouteEntity(List<RouteEntity> routeEntity) {
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

	public List<DriverEntity> getDriverEntity() {
		return driverEntity;
	}

	public void setDriverEntity(List<DriverEntity> driverEntity) {
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
		return "ReservationEntity [reservationId=" + reservationId + ", userCredentialsEntity=" + userCredentialsEntity
				+ ", vehicleEntity=" + vehicleEntity + ", routeEntity=" + routeEntity + ", bookingDate=" + bookingDate
				+ ", journeyDate=" + journeyDate + ", driverEntity=" + driverEntity + ", bookingStatus=" + bookingStatus
				+ ", totalFare=" + totalFare + ", boardingPoint=" + boardingPoint + ", dropPoint=" + dropPoint + "]";
	}

	
}
