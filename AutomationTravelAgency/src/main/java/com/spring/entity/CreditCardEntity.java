package com.spring.entity;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ata_tbl_credit_card")
public class CreditCardEntity 
{
	@Id
	@GeneratedValue
	@Column(name="CREDITCARDID")
	private long creditCardId;
	
	@Column(name="CREDITCARDNUMBER")
	private String creditCardNumber;
	
	@Column(name="VALIDFROM")
	private String  validFrom;
	
	@Column(name="VALIDTO")
	private String validTo;
	
	@Column(name="CREDITBALANCE")
	private int creditBalance;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "USERID")
	private UserProfileEntity userProfileEntity;

	public CreditCardEntity() {
		super();
	 
	}

	public CreditCardEntity( String creditCardNumber, String validFrom, String validTo,	int creditBalance) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.creditBalance = creditBalance;
	}

	public CreditCardEntity(String creditCardNumber, String validFrom, String validTo, int creditBalance,
			UserProfileEntity userProfileEntity) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.creditBalance = creditBalance;
		this.userProfileEntity = userProfileEntity;
	}

	public CreditCardEntity(  String validFrom, String validTo, int creditBalance,
			UserProfileEntity userProfileEntity) {
		super(); 
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.creditBalance = creditBalance;
		this.userProfileEntity = userProfileEntity;
	}

	public long getCreditCardId() {
		return creditCardId;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCardNumber() {
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

	public UserProfileEntity getUserProfileEntity() {
		return userProfileEntity;
	}

	public void setUserProfileEntity(UserProfileEntity userProfileEntity) {
		this.userProfileEntity = userProfileEntity;
	}

	@Override
	public String toString() {
		return "CreditCardEntity [creditCardId=" + creditCardId + ", creditCardNumber=" + creditCardNumber
				+ ", validFrom=" + validFrom + ", validTo=" + validTo + ", creditBalance=" + creditBalance
				+ ", userProfileEntity=" + userProfileEntity + "]";
	}
	 
	
	
}
