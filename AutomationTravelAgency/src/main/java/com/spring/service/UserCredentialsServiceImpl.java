package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.json.UserCredentials;
import com.spring.rest.repository.UserCredentialsRepository;
import com.spring.utils.UserCredentialsUtils;

import com.spring.entity.UserProfileEntity;
import com.spring.json.UserProfile;
import com.spring.rest.repository.UserProfileRepository;
import com.spring.utils.UserProfileUtils;


 
@Service
public class UserCredentialsServiceImpl implements UserCredentialsService  
{


private UserCredentialsRepository userRepository;



@Override
public UserCredentials save(UserCredentials usercredentials) {
	com.spring.entity.UserCredentialsEntity userCredentialsEntity = 
			userRepository.save(UserCredentialsUtils.convertUserCredentialsToUserCredentialsEntity(usercredentials));
	return UserCredentialsUtils.convertUserCredentialsEntityToUserCredentials(userCredentialsEntity);
}


@Override
public String autoLogin(UserCredentials usercredentials) {
	com.spring.entity.UserCredentialsEntity user1=userRepository.findById(usercredentials.getUserId());
	if(user1!=null) {
		if(user1.getPassword().equals((usercredentials.getPassword()))) {
			String sessionId = new java.rmi.server.UID().toString().substring(0, 10);
			user1.setSessionId(sessionId);
			userRepository.save(user1);
			return sessionId;
			String userType = new java.rmi.server.UID().toString().substring(0, 10);
			user1.setUserType(userType);
			userRepository.save(user1);
			return userType;
			
			
		}
		else {
			return "invalid password";
		}
	

	}
	 

	else {
		return "invalid username";
	}	
	
}




@Override
public UserProfile save(UserProfile userProfile) {
	UserProfileEntity userProfileEntity = userRepository.save(UserProfileUtils.convertUserProfileToUserProfileEntity(userProfile));
	return UserProfileUtils.convertUserProfileEntityToUserProfile(userProfileEntity);
}

@Override
public UserCredentials autoLogout(String apiKey) {
	com.spring.entity.UserCredentialsEntity user1=userRepository.findBySessionId(apiKey).get(0);
	user1.setSessionId(null);
	com.spring.entity.UserCredentialsEntity userEntity=userRepository.save(user1);	
	return UserCredentialsUtils.convertUserCredentialsEntityToUserCredentials(userEntity);
}



	
	
	}



