package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.json.UserCredentials;
import com.spring.rest.repository.UserCredentialsRepository;
import com.spring.utils.UserCredentialsUtils;

import com.spring.entity.UserProfileEntity;
import com.spring.json.UserProfile;
import com.spring.rest.repository.UserProfileRepository;
import com.spring.rest.repository.UserCredentialsRepository;
import com.spring.utils.UserProfileUtils;




 
@Service
public class UserCredentialsServiceImpl implements UserCredentialsService  
{
@Autowired
private UserProfileRepository userRepository;

@Autowired
private UserCredentialsRepository userCredentialRepository;







@Override
public String autoLogin(UserCredentials usercredentials) {

	com.spring.entity.UserCredentialsEntity user1=userRepository.findById(usercredentials.getUserId()).get(0);
	if(user1!=null) {
		if(user1.getPassword().equals((usercredentials.getPassword()))) {

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
	
}




public UserProfile save(UserProfile userProfile) 
{
	UserProfileEntity userProfileEntity = userRepository.save(UserProfileUtils.convertUserProfileToUserProfileEntity(userProfile));
	return UserProfileUtils.convertUserProfileEntityToUserProfile(userProfileEntity);
}


@Override
public UserCredentials autoLogout(String apiKey) {
	com.spring.entity.UserCredentialsEntity user1=userCredentialRepository.findBySessionId(apiKey).get(0);
	user1.setSessionId(null);

	com.spring.entity.UserCredentialsEntity userEntity=userRepository.save(user1);	
	return UserCredentialsUtils.convertUserCredentialsEntityToUserCredentials(userEntity);
}


@Override
public boolean requestPasswordReset(String password) {
		
return false;

}



	
	
	}



