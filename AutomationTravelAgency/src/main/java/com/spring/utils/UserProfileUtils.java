package com.spring.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.spring.entity.UserProfileEntity;
import com.spring.json.UserProfile;
 

public class UserProfileUtils 
{
	public static List<UserProfile> convertUserProfileEntityListToUserProfileList(List<UserProfileEntity> userProfileEntityList) {
		List<UserProfile> userProfileList = new ArrayList<UserProfile>();
		Consumer<UserProfileEntity> consumer = (UserProfileEntity userProfileEntity)->userProfileList.add(convertUserProfileEntityToUserProfile(userProfileEntity));
		userProfileEntityList.stream().forEach(consumer);
		return userProfileList;
	}
	
	public static UserProfile convertUserProfileEntityToUserProfile(UserProfileEntity userProfileEntity) {
		return new UserProfile(userProfileEntity.getFirstName(),userProfileEntity.getLastName(),userProfileEntity.getDateOfBirth(),userProfileEntity.getGender(),userProfileEntity.getStreet(),userProfileEntity.getLocation()
					,userProfileEntity.getCity(),userProfileEntity.getState(),userProfileEntity.getPincode(),userProfileEntity.getMobileNo(),userProfileEntity.getEmailId(),userProfileEntity.getUserId(),userProfileEntity.getPassword(),userProfileEntity.getUserType(),
					userProfileEntity.getLoginStatus(),userProfileEntity.getSessionId(),CreditCardUtils.convertCreditCardEntityListToCreditCardList(userProfileEntity.getCreditCards()),ReservationUtils.convertReservationEntityListToReservationList(userProfileEntity.getReservationList()));
	}

	public static UserProfileEntity convertUserProfileToUserProfileEntity(UserProfile userProfile) {
		return new UserProfileEntity(userProfile.getFirstName(),userProfile.getLastName(),userProfile.getDateOfBirth(),userProfile.getGender(),userProfile.getStreet(),userProfile.getLocation()
				,userProfile.getCity(),userProfile.getState(),userProfile.getPincode(),userProfile.getMobileNo(),userProfile.getEmailId(),userProfile.getPassword(),userProfile.getUserType(),
				userProfile.getLoginStatus(),userProfile.getSessionId(),CreditCardUtils.convertCreditCardListToCreditCardEntityList(userProfile.getCreditCardList()),ReservationUtils.convertReservationListToReservationEntityList(userProfile.getReservationList()));}
}
