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
			
			com.spring.entity.UserProfileEntity user1=userProfileRepository.findById(userProfile.getUserId()).get();
			if(user1!=null) {
				if(user1.getPassword().equals((userProfile.getPassword()))) {
		
					String sessionId = new java.rmi.server.UID().toString().substring(0, 10);
					user1.setSessionId(sessionId);
					userProfileRepository.save(user1);
					
					user1.setLoginStatus(1);
					userProfileRepository.save(user1);
					return "session Id" +sessionId;
					
					
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



			@Override
			public UserProfile save(UserProfile userProfile) 
			{
				UserProfileEntity userProfileEntity = userProfileRepository.save(UserProfileUtils.convertUserProfileToUserProfileEntity(userProfile));
				return UserProfileUtils.convertUserProfileEntityToUserProfile(userProfileEntity);
			}


			@Override
			public UserProfile autoLogout(String apiKey) 
			{
				com.spring.entity.UserProfileEntity user1=userProfileRepository.findBySessionId(apiKey).get(0);
				user1.setSessionId(null);
			
				com.spring.entity.UserProfileEntity userCredentialsEntity=userProfileRepository.save(user1);	
				return UserProfileUtils.convertUserProfileEntityToUserProfile(userCredentialsEntity);
			
			}

}



