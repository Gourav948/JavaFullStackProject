package com.spring.service;




import com.spring.json.UserProfile;

 

public interface UserCredentialsService 
{


	public String autoLogin(UserProfile usercredentials);
	public UserProfile autoLogout(String apiKey);



	
	public boolean requestPasswordReset(String password);
 
	 




	public UserProfile save(UserProfile userProfile);

}
