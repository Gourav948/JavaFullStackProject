package com.spring.service;




import com.spring.json.UserCredentials;


 

public interface UserCredentialsService {

	public String autoLogin(UserCredentials usercredentials);
	public UserCredentials autoLogout(String apiKey);

	 

}
