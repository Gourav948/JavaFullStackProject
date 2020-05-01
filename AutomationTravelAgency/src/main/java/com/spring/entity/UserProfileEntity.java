package com.spring.entity;

import java.time.LocalDate;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ATA_TBL_User_Profile")
public class UserProfileEntity 
{
	 
	
	@Column(name="FIRSTNAME")
	private String  firstName;
	
	@Column(name="LASTNAME")
	private String lastName;
	
	@Column(name="DATEOFBIRTH")
	private LocalDate dateOfBirth;
	
	@Column(name="GENDER")
	private String gender;
	
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
	
	@Column(name="EMAILID")
	private String emailId;
	
	 

	public UserCredentialsEntity getUserCredentialsEntity() {
		return userCredentialsEntity;
	}

	public void setUserCredentialsEntity(UserCredentialsEntity userCredentialsEntity) {
		this.userCredentialsEntity = userCredentialsEntity;
	}

	@OneToOne(cascade={CascadeType.PERSIST}, fetch=FetchType.LAZY)
	@JoinColumn(name="USERID")
	private UserCredentialsEntity userCredentialsEntity;
	@OneToMany(cascade={CascadeType.PERSIST}, 
			fetch=FetchType.EAGER, mappedBy = "userCredentialsEntity")
	private Set<CreditCardEntity> creditCards;
	
	@OneToMany(cascade={CascadeType.PERSIST}, 
			fetch=FetchType.EAGER, mappedBy = "userCredentialsEntity")
	private Set<ReservationEntity> reservationList;
	
	public UserProfileEntity() {
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

	public Set<CreditCardEntity> getCreditCards() {
		return creditCards;
	}

	public void setCreditCards(Set<CreditCardEntity> creditCards) {
		this.creditCards = creditCards;
	}

	public Set<ReservationEntity> getReservationList() {
		return reservationList;
	}

	public void setReservationList(Set<ReservationEntity> reservationList) {
		this.reservationList = reservationList;
	}

	public UserProfileEntity(String firstName, String lastName, LocalDate dateOfBirth, String gender, String street,
			String location, String city, String state, String pincode, String mobileNo, String emailId,
			UserCredentialsEntity userCredentialsEntity) {
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
		this.userCredentialsEntity = userCredentialsEntity;
	}

	public UserProfileEntity(String firstName, String lastName, LocalDate dateOfBirth, String gender, String street,
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

	public UserProfileEntity(String firstName, String lastName, LocalDate dateOfBirth, String gender, String street,
			String location, String city, String state, String pincode, String mobileNo, String emailId,
			UserCredentialsEntity userCredentialsEntity, Set<CreditCardEntity> creditCards,
			Set<ReservationEntity> reservationList) {
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
		this.userCredentialsEntity = userCredentialsEntity;
		this.creditCards = creditCards;
		this.reservationList = reservationList;
	}

	@Override
	public String toString() {
		return "UserProfileEntity [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", street=" + street + ", location=" + location + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + ", mobileNo=" + mobileNo + ", emailId=" + emailId
				+ ", userCredentialsEntity=" + userCredentialsEntity + ", creditCards=" + creditCards
				+ ", reservationList=" + reservationList + "]";
	}

	 
	
	 
	
	
	
}
