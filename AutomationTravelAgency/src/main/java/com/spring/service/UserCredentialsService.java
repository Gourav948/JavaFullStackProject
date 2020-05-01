package com.spring.service;




import com.spring.json.UserProfile;

 

public interface UserCredentialsService 
{


	public String autoLogin(UserProfile usercredentials);
	public UserProfile autoLogout(String apiKey);



<<<<<<< HEAD

	public UserProfile save(UserProfile userProfile);

=======
	
	public boolean requestPasswordReset(String password);
 
>>>>>>> 19a8530d51832b69a554dc34690192b4438c2931
	 




	public UserProfile save(UserProfile userProfile);

	public boolean requestPasswordReset(long userId);

}
