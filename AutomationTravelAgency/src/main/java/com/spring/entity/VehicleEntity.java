package com.spring.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ATA_TBL_Vehicle")
public class VehicleEntity 
{
	@Id
	@GeneratedValue
	@Column(name="VEHICLEID")
	private long vehicleId;
	
	@Column(name="NAME")
	private String  name;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="REGISTRATIONNUMBER")
	private String registrationNumber;
	
	@Column(name="SEATINGCAPACITY")
	private int seatingCapacity;
	
	@Column(name="FAREPERKM")
	private int farePerKm;
	
	@OneToMany(cascade={CascadeType.PERSIST}, 
			fetch=FetchType.EAGER, mappedBy = "userCredentialsEntity")
	private Set<ReservationEntity> reservationList;

	public VehicleEntity() {
		super(); 
	}
	
	public VehicleEntity(long vehicleId, String name, String type, String registrationNumber, int seatingCapacity,
			int farePerKm) {
		super();
		this.vehicleId = vehicleId;
		this.name = name;
		this.type = type;
		this.registrationNumber = registrationNumber;
		this.seatingCapacity = seatingCapacity;
		this.farePerKm = farePerKm;
	}
	
	public VehicleEntity(  String name, String type, String registrationNumber, int seatingCapacity,
			int farePerKm) {
		super(); 
		this.name = name;
		this.type = type;
		this.registrationNumber = registrationNumber;
		this.seatingCapacity = seatingCapacity;
		this.farePerKm = farePerKm;
	}

	public VehicleEntity(long vehicleId, String name, String type, String registrationNumber, int seatingCapacity,
			int farePerKm, Set<ReservationEntity> reservationList) {
		super();
		this.vehicleId = vehicleId;
		this.name = name;
		this.type = type;
		this.registrationNumber = registrationNumber;
		this.seatingCapacity = seatingCapacity;
		this.farePerKm = farePerKm;
		this.reservationList = reservationList;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public int getFarePerKm() {
		return farePerKm;
	}

	public void setFarePerKm(int farePerKm) {
		this.farePerKm = farePerKm;
	}

	public Set<ReservationEntity> getReservationList() {
		return reservationList;
	}

	public void setReservationList(Set<ReservationEntity> reservationList) {
		this.reservationList = reservationList;
	}

	@Override
	public String toString() {
		return "VehicleEntity [vehicleId=" + vehicleId + ", name=" + name + ", type=" + type + ", registrationNumber="
				+ registrationNumber + ", seatingCapacity=" + seatingCapacity + ", farePerKm=" + farePerKm
				+ ", reservationList=" + reservationList + "]";
	}
	
	
	 
}
