package com.spring.json;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
 

public class CreditCard 
{ 
	private String creditCardNumber; 
	private String  validFrom; 
	private String validTo; 
	private int creditBalance;
	@OneToOne(cascade=CascadeType.ALL) 
	private UserProfile  userProfile ;

	 
	public CreditCard() {
		super();
		 
	}


	public CreditCard(String creditCardNumber, String validFrom, String validTo, int creditBalance,
			UserProfile userProfile) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.creditBalance = creditBalance;
		this.userProfile = userProfile;
	}
	


	public String getCreditCardNumber() {
		return creditCardNumber;
	}


	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}


	public String getValidFrom() {
		return validFrom;
	}


	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}


	public String getValidTo() {
		return validTo;
	}


	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}


	public int getCreditBalance() {
		return creditBalance;
	}


	public void setCreditBalance(int creditBalance) {
		this.creditBalance = creditBalance;
	}


	public UserProfile getUserProfile() {
		return userProfile;
	}


	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}


	@Override
	public String toString() {
		return "CreditCard [creditCardNumber=" + creditCardNumber + ", validFrom=" + validFrom + ", validTo=" + validTo
				+ ", creditBalance=" + creditBalance + ", userProfile=" + userProfile + "]";
	}

	 
	
	
	
}
