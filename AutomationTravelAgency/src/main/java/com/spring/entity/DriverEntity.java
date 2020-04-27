package com.spring.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ATA_TBL_Driver")
public class DriverEntity 
{
	 
	@Id
	@GeneratedValue
	@Column(name="DRIVERID")
	private long driverId;
	
	@Column(name="NAME")
	private String  name;
	
	@Column(name="STREET")
	private String street;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="PINCODE")
	private String pincode;
	
	@Column(name="MOBILENO")
	private String mobileNo;
	
	@Column(name="LICENSENUMBER")
	private String licenseNumber; 
	
	public DriverEntity() {
		super();
	 
	}
	public long getDriverId() {
		return driverId;
	}
	public String getName() {
		return name;
	}

	public void setFirstName(String name) {
		this.name = name;
	}

	 

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public DriverEntity(String name, String street,String location, String city, String state, 
			String pincode, String mobileNo, String licenseNumber) {
		super();
		this.name=name; 
		this.street = street;
		this.location = location;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobileNo = mobileNo;
		this.licenseNumber = licenseNumber;
		 
	}

	public DriverEntity(long driverId ,String name, String street,	String location, String city,
			String state, String pincode, String mobileNo, String licenseNumber) {
		super();
		 this.driverId=driverId;
		 this.name=name;
		this.street = street;
		this.location = location;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobileNo = mobileNo;
		this.licenseNumber = licenseNumber;
	}

	@Override
	public String toString() {
		return "DriverEntity [driverId=" + driverId + ", name=" + name + ", street=" + street + ", location=" + location
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", mobileNo=" + mobileNo
				+ ", licenseNumber=" + licenseNumber + "]";
	}

	 

	 
	
	 
	
	
	
}
