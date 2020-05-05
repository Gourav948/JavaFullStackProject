package com.spring.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.entity.CreditCardEntity;
import com.spring.entity.ReservationEntity;
import com.spring.entity.UserProfileEntity;
import com.spring.json.CreditCard;
import com.spring.json.Reservation;
import com.spring.json.UserProfile;
import com.spring.rest.repository.UserProfileRepository;
 

public class UserProfileUtils 
{
	@Autowired
	UserProfileRepository userProfileRepository;
	
	
	public static List<UserProfile> convertUserProfileEntityListToUserProfileList(List<UserProfileEntity> userProfileEntityList) {
		List<UserProfile> userProfileList = new ArrayList<UserProfile>();
		Consumer<UserProfileEntity> consumer = (UserProfileEntity userProfileEntity)->userProfileList.add(convertUserProfileEntityToUserProfile(userProfileEntity));
		userProfileEntityList.stream().forEach(consumer);
		return userProfileList;
	}
	
	/*public static UserProfile convertUserProfileEntityToUserProfile(UserProfileEntity userProfileEntity) {
		return new UserProfile(userProfileEntity.getFirstName(),userProfileEntity.getLastName(),userProfileEntity.getDateOfBirth(),userProfileEntity.getGender(),userProfileEntity.getStreet(),userProfileEntity.getLocation()
					,userProfileEntity.getCity(),userProfileEntity.getState(),userProfileEntity.getPincode(),userProfileEntity.getMobileNo(),userProfileEntity.getEmailId(),userProfileEntity.getUserId(),userProfileEntity.getPassword(),userProfileEntity.getUserType(),
					userProfileEntity.getLoginStatus(),userProfileEntity.getSessionId(),CreditCardUtils.convertCreditCardEntityListToCreditCardList(userProfileEntity.getCreditCards()),ReservationUtils.convertReservationEntityListToReservationList(userProfileEntity.getReservationList()));
	}*/
	public static UserProfile convertUserProfileEntityToUserProfile(UserProfileEntity userProfileEntity) {
		return new UserProfile(userProfileEntity.getUserId(),userProfileEntity.getFirstName(),userProfileEntity.getLastName(),userProfileEntity.getDateOfBirth(),userProfileEntity.getGender(),userProfileEntity.getStreet(),userProfileEntity.getLocation()
					,userProfileEntity.getCity(),userProfileEntity.getState(),userProfileEntity.getPincode(),userProfileEntity.getMobileNo(),userProfileEntity.getEmailId(),userProfileEntity.getPassword(),userProfileEntity.getUserType());
	}
	
	public static UserProfileEntity convertUserProfileToUserProfileEntity(UserProfile userProfile) {
		return new UserProfileEntity(userProfile.getFirstName(),userProfile.getLastName(),userProfile.getDateOfBirth(),userProfile.getGender(),userProfile.getStreet(),userProfile.getLocation()
				,userProfile.getCity(),userProfile.getState(),userProfile.getPincode(),userProfile.getMobileNo(),userProfile.getEmailId(),userProfile.getPassword(),userProfile.getUserType());
}
	
	public static List<CreditCardEntity> convertUserToUserEntityForCreditCard(UserProfile userProfile)
	{
		List<CreditCard> creditCardList= userProfile.getCreditCardList();
		
		Iterator<CreditCard> itr = creditCardList.iterator();
		List<CreditCardEntity> creditCardEntityList= new ArrayList<CreditCardEntity>();
		while(itr.hasNext())
		{
			CreditCard creditCard =itr.next();
			
			CreditCardEntity creditCardEntity=CreditCardUtils.convertCreditCardToCreditCardEntity(creditCard);
			//System.out.println("456"+creditCardEntity);
			creditCardEntityList.add(creditCardEntity);
			
		}
		
		
		return creditCardEntityList;
			
	}
	public static List<ReservationEntity> convertUserToUserEntityForReservation(UserProfile userProfile)
	{
	List<Reservation> reservationList= userProfile.getReservationList();
	
	Iterator<Reservation> itr_3 = reservationList.iterator();
	List<ReservationEntity> reservationEntityList= new ArrayList<ReservationEntity>();
	while(itr_3.hasNext())
	{
		Reservation reservation =itr_3.next();
		ReservationEntity reservationEntity =convertReservationToReservationEntity(reservation);
		//System.out.println("123"+reservationEntity);
		reservationEntityList.add(reservationEntity);
		
	}
	return reservationEntityList;
	}

	public static ReservationEntity convertReservationToReservationEntity(Reservation reservation) {
			return new ReservationEntity(reservation.getJourneyDate());
	}


	/*public static UserProfileEntity convertUserProfileToUserProfileEntity(UserProfile userProfile) {
		return new UserProfileEntity(userProfile.getFirstName(),userProfile.getLastName(),userProfile.getDateOfBirth(),userProfile.getGender(),userProfile.getStreet(),userProfile.getLocation()
				,userProfile.getCity(),userProfile.getState(),userProfile.getPincode(),userProfile.getMobileNo(),userProfile.getEmailId());
}
*/
	
}
