package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.UserProfileEntity;
import com.spring.json.UserProfile;
import com.spring.rest.repository.UserProfileRepository;
import com.spring.utils.UserProfileUtils;




 
@Service
public class UserCredentialsServiceImpl implements UserCredentialsService  
{
@Autowired
private UserProfileRepository userProfileRepository;











@Override
public String autoLogin(UserProfile userProfile) 
{
	/*
	com.spring.entity.UserProfileEntity user1=userProfileRepository.findById(userProfile.getUserId()).get(0);
	if(user1!=null) {
		if(user1.getPassword().equals((userProfile.getPassword()))) {

			String sessionId = new java.rmi.server.UID().toString().substring(0, 10);
			user1.setSessionId(sessionId);
			userCredentialRepository.save(user1);
			String userType = new java.rmi.server.UID().toString().substring(0, 10);
			user1.setUserType(userType);
			userCredentialRepository.save(user1);
			return "userType="+userType+"session Id" +sessionId;
			
			
		}
		else 
		{
			return "invalid password";
		}

	}
	 

	else {
		return "invalid username";
	}	
	*/
	return null;
}




public UserProfile save(UserProfile userProfile) 
{
	UserProfileEntity userProfileEntity = userProfileRepository.save(UserProfileUtils.convertUserProfileToUserProfileEntity(userProfile));
	return UserProfileUtils.convertUserProfileEntityToUserProfile(userProfileEntity);
}


@Override
public UserProfile autoLogout(String apiKey) 
{/*
	com.spring.entity.UserProfileEntity user1=userProfileRepository.findBySessionId(apiKey).get(0);
	user1.setSessionId(null);

	com.spring.entity.UserProfileEntity userCredentialsEntity=userProfileRepository.save(user1);	
	return UserCredentialsUtils.convertUserCredentialsEntityToUserCredentials(userCredentialsEntity);
*/
	return null;
}




 

/*
@Override
public String requestPasswordReset(UserCredentials usercredentials) {
	
	com.spring.entity.UserCredentialsEntity usernew=userCredentialRepository.findById(usercredentials.getUserId()).get(0);
	if(usernew==null) {
		if(usernew.getPassword().equals((usercredentials.getPassword()))) 
		{
		String newpassword=usernew.getPassword();
		return newpassword;
				
		}
		else 
		{
			return "invalid password";
		}
	
	}
	else 
		return "invalid id";
}*/




@Override
public boolean requestPasswordReset(String password) {
	// TODO Auto-generated method stub
	return false;
}



	
	
	}



