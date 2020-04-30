package com.spring.service;




import com.spring.json.UserCredentials;


import com.spring.json.UserProfile;

 

public interface UserCredentialsService 
{


	public String autoLogin(UserCredentials usercredentials);
	public UserCredentials autoLogout(String apiKey);


<<<<<<< HEAD
	UserProfile save(UserProfile userProfile);
	public boolean requestPasswordReset(String password);

=======
	public UserProfile save(UserProfile userProfile);
>>>>>>> branch 'master' of https://github.com/Gourav948/JavaFullStackProject.git

	 

	 

}
