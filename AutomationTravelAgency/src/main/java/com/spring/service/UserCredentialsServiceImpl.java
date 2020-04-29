package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.UserProfileEntity;
import com.spring.json.UserProfile;
import com.spring.rest.repository.UserCredentialsRepository;
import com.spring.rest.repository.UserProfileRepository;
import com.spring.utils.UserProfileUtils;

 
@Service
public class UserCredentialsServiceImpl implements UserCredentialsService  
{
	@Autowired
	private UserProfileRepository userRepository;
	@Override
	public UserProfile save(UserProfile userProfile) {
		UserProfileEntity userProfileEntity = userRepository.save(UserProfileUtils.convertUserProfileToUserProfileEntity(userProfile));
		return UserProfileUtils.convertUserProfileEntityToUserProfile(userProfileEntity);
	}
	 
	

}
