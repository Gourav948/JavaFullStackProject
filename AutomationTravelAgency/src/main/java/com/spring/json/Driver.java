package com.spring.json;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
 

public class Driver 
{
	 
		private long driverId; 
		private String  name; 
		private String street; 
		private String location; 
		private String city; 
		private String state; 
		private String pincode; 
		private String mobileNo; 
		private String licenseNumber;
		public Driver() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Driver(long driverId, String name, String street, String location, String city, String state,
				String pincode, String mobileNo, String licenseNumber) {
			super();
			this.driverId = driverId;
			this.name = name;
			this.street = street;
			this.location = location;
			this.city = city;
			this.state = state;
			this.pincode = pincode;
			this.mobileNo = mobileNo;
			this.licenseNumber = licenseNumber;
		}
		public long getDriverId() {
			return driverId;
		}
		public void setDriverId(long driverId) {
			this.driverId = driverId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
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
		@Override
		public String toString() {
			return "Driver [driverId=" + driverId + ", name=" + name + ", street=" + street + ", location=" + location
					+ ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", mobileNo=" + mobileNo
					+ ", licenseNumber=" + licenseNumber + "]";
		} 
	
		
	
}
