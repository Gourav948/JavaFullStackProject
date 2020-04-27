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
	private long creditCardNumber; 
	private String  validFrom; 
	private String validTo; 
	private int creditBalance;
	@OneToOne(cascade=CascadeType.ALL) 
	private UserCredentials  userCredentials ;

	 
	public CreditCard() {
		super();
		 
	}


	public CreditCard(long creditCardNumber, String validFrom, String validTo, int creditBalance,
			UserCredentials userCredentials) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.creditBalance = creditBalance;
		this.userCredentials = userCredentials;
	}
	


	public long getCreditCardNumber() {
		return creditCardNumber;
	}


	public void setCreditCardNumber(long creditCardNumber) {
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


	public UserCredentials getUserCredentials() {
		return userCredentials;
	}


	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}


	@Override
	public String toString() {
		return "CreditCard [creditCardNumber=" + creditCardNumber + ", validFrom=" + validFrom + ", validTo=" + validTo
				+ ", creditBalance=" + creditBalance + ", userCredentials=" + userCredentials + "]";
	}

	 
	
	
	
}
