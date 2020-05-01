package com.spring.service;




import com.spring.json.UserCredentials;


import com.spring.json.UserProfile;

 

public interface UserCredentialsService 
{


	public String autoLogin(UserCredentials usercredentials);
	public UserCredentials autoLogout(String apiKey);



	
	public boolean requestPasswordReset(String password);

	public UserProfile save(UserProfile userProfile);

	 




	public UserCredentials save(UserCredentials userProfile);

}
