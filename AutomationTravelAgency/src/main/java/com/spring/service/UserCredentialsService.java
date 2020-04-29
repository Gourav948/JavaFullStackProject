package com.spring.service;




import com.spring.json.UserCredentials;


import com.spring.json.UserProfile;

 

public interface UserCredentialsService {


	public String autoLogin(UserCredentials usercredentials);
	public UserCredentials autoLogout(String apiKey);


	UserProfile save(UserProfile userProfile);

	 

	 

}
