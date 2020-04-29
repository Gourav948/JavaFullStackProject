package com.spring.json;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
 
 

public class UserProfile 
{
	  
	private String  firstName; 
	private String lastName; 
	private LocalDate dateOfBirth; 
	private String gender; 
	private String street; 
	private String location; 
	private String city; 
	private String state; 
	private String pincode; 
	private String mobileNo; 
	private String emailId;

	@OneToOne(cascade={CascadeType.PERSIST}, fetch=FetchType.LAZY)
	private UserCredentials userCredentials;
	
	@OneToMany(cascade={CascadeType.PERSIST}, 
			fetch=FetchType.EAGER, mappedBy = "userCredentialsEntity")
	private Set<CreditCard> creditCardList;
	
	@OneToMany(cascade={CascadeType.PERSIST}, 
			fetch=FetchType.EAGER, mappedBy = "userCredentialsEntity")
	private Set<Reservation> reservationList;
	
	public UserProfile() {
		super();
	 
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public UserCredentials getUserCredentials() {
		return userCredentials;
	}

	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}

	public Set<CreditCard> getCreditCardList() {
		return creditCardList;
	}

	public void setCreditCardList(Set<CreditCard> creditCardList) {
		this.creditCardList = creditCardList;
	}

	public Set<Reservation> getReservationList() {
		return reservationList;
	}

	public void setReservationList(Set<Reservation> reservationList) {
		this.reservationList = reservationList;
	}

	public UserProfile(String firstName, String lastName, LocalDate dateOfBirth, String gender, String street,
			String location, String city, String state, String pincode, String mobileNo, String emailId,
			UserCredentials userCredentialsEntity) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.street = street;
		this.location = location;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.userCredentials = userCredentialsEntity;
	}

	public UserProfile(String firstName, String lastName, LocalDate dateOfBirth, String gender, String street,
			String location, String city, String state, String pincode, String mobileNo, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.street = street;
		this.location = location;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}

	public UserProfile(String firstName, String lastName, LocalDate dateOfBirth, String gender, String street,
			String location, String city, String state, String pincode, String mobileNo, String emailId,
			UserCredentials userCredentials, Set<CreditCard> creditCardList, Set<Reservation> reservationList) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.street = street;
		this.location = location;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.userCredentials = userCredentials;
		this.creditCardList = creditCardList;
		this.reservationList = reservationList;
	}

	@Override
	public String toString() {
		return "UserProfile [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", street=" + street + ", location=" + location + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + ", mobileNo=" + mobileNo + ", emailId=" + emailId
				+ ", userCredentials=" + userCredentials + ", creditCardList=" + creditCardList + ", reservationList="
				+ reservationList + "]";
	}
	
	
	
}
