package com.spring.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.spring.entity.UserCredentialsEntity;
import com.spring.json.UserCredentials;
 

public class UserCredentialsUtils 
{
	public static List<UserCredentials> convertUserCredentialsEntityListToUserCredentialsList(List<UserCredentialsEntity> userCredentialsEntityList) {
		List<UserCredentials> userCredentialsList = new ArrayList<UserCredentials>();
		Consumer<UserCredentialsEntity> consumer = (UserCredentialsEntity userCredentialsEntity)->userCredentialsList.add(convertUserCredentialsEntityToUserCredentials(userCredentialsEntity));
		userCredentialsEntityList.stream().forEach(consumer);
		return userCredentialsList;
	}
	
	public static UserCredentials convertUserCredentialsEntityToUserCredentials(UserCredentialsEntity userCredentialsEntity) {
		return new UserCredentials(userCredentialsEntity.getUserId(), userCredentialsEntity.getPassword(),userCredentialsEntity.getUserType(),userCredentialsEntity.getLoginStatus());
	}

	public static UserCredentialsEntity convertUserCredentialsToUserCredentialsEntity(UserCredentials userCredentials) {
		return new UserCredentialsEntity(userCredentials.getPassword(),userCredentials.getUserType(),userCredentials.getLoginStatus());
		}

	
	
}
