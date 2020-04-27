package com.spring.entity;

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
@Table(name = "ATA_TBL_CreditCard")
public class CreditCardEntity 
{
	@Id
	@GeneratedValue
	@Column(name="CREDITCARDNUMBER")
	private long creditCardNumber;
	
	@Column(name="VALIDFROM")
	private String  validFrom;
	
	@Column(name="VALIDTO")
	private String validTo;
	
	@Column(name="CREDITBALANCE")
	private int creditBalance;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "USERID")
	private UserCredentialsEntity userCredentialsEntity;

	public CreditCardEntity() {
		super();
	 
	}

	public CreditCardEntity(  String validFrom, String validTo, int creditBalance,
			UserCredentialsEntity userCredentialsEntity) {
		super(); 
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.creditBalance = creditBalance;
		this.userCredentialsEntity = userCredentialsEntity;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
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

	public UserCredentialsEntity getUserCredentialsEntity() {
		return userCredentialsEntity;
	}

	public void setUserCredentialsEntity(UserCredentialsEntity userCredentialsEntity) {
		this.userCredentialsEntity = userCredentialsEntity;
	}

	@Override
	public String toString() {
		return "CreditCardEntity [creditCardNumber=" + creditCardNumber + ", validFrom=" + validFrom + ", validTo="
				+ validTo + ", creditBalance=" + creditBalance + ", userCredentialsEntity=" + userCredentialsEntity
				+ "]";
	}
	 
	
	
}
