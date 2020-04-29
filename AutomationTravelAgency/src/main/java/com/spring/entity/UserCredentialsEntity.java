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
@Table(name = "ATA_TBL_User_Credentials")
public class UserCredentialsEntity 
{
	@Id
	@GeneratedValue
	@Column(name="USERID")
	private long userId;
	
	@Column(name="PASSWORD")
	private String  password;
	
	@Column(name="USERTYPE")
	private String userType;
	
	@Column(name="LOGINSTATUS")
	private int loginStatus;
	
	@OneToMany(cascade={CascadeType.PERSIST}, 
			fetch=FetchType.EAGER, mappedBy = "userCredentialsEntity")
	private Set<CreditCardEntity> creditCards;
	
	@OneToMany(cascade={CascadeType.PERSIST}, 
			fetch=FetchType.EAGER, mappedBy = "userCredentialsEntity")
	private Set<ReservationEntity> reservationList;

	public UserCredentialsEntity() {
		super();
	 
	}
	public UserCredentialsEntity(String password, String userType, int loginStatus) {
		super();
		this.password = password;
		this.userType = userType;
		this.loginStatus = loginStatus;
	}

	public UserCredentialsEntity(long userId, String password, String userType, int loginStatus) {
		super();
		this.userId = userId;
		this.password = password;
		this.userType = userType;
		this.loginStatus = loginStatus;
	}
	
	public long getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}
	@Override
	public String toString() {
		return "UserCredentialsEntity [userId=" + userId + ", password=" + password + ", userType=" + userType
				+ ", loginStatus=" + loginStatus + "]";
	}

	
	
	
	
}
