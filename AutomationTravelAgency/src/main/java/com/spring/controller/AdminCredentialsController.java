package com.spring.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.VehicleEntity;
import com.spring.entity.ReservationEntity;
import com.spring.entity.RouteEntity;
import com.spring.entity.UserProfileEntity;
import com.spring.entity.UserProfileEntity;
import com.spring.json.Driver;
import com.spring.json.Route;
import com.spring.json.UserProfile;
import com.spring.json.Vehicle;
import com.spring.rest.repository.ReservationRepository;
import com.spring.rest.repository.RouteRepository;
import com.spring.rest.repository.UserProfileRepository;
import com.spring.service.AdminCredentialsService;
import com.spring.utils.UserProfileUtils;

@RestController
@RequestMapping("/app/admin/")
public class AdminCredentialsController {
	
	@Autowired
	private AdminCredentialsService admincredentialsservice;
	private UserProfileRepository userProfileRepository;
	private RouteRepository routeRepository;
	private ReservationEntity reservationEntity; 
	private ReservationRepository reservationRepository;

	
	public UserProfile updateUserProfile(UserProfile userProfile, String id) {
		UserProfileEntity userProfileEntity = userProfileRepository.findById(Long.valueOf(id)).get();
		if(userProfileEntity != null) {
			userProfileEntity.setCity(userProfile.getCity());
		//	userProfileEntity.setCreditCards(userProfile.getCreditCardList());
			userProfileEntity.setDateOfBirth(userProfile.getDateOfBirth());
			userProfileEntity.setEmailId(userProfile.getEmailId());
			userProfileEntity.setFirstName(userProfile.getFirstName());
			userProfileEntity.setGender(userProfile.getGender());
			userProfileEntity.setLastName(userProfile.getLastName());
			userProfileEntity.setLocation(userProfile.getLocation());
			userProfileEntity.setMobileNo(userProfile.getMobileNo());
			userProfileEntity.setPincode(userProfile.getPincode());
			userProfileEntity.setStreet(userProfile.getStreet());
			userProfileEntity.setState(userProfile.getState());
	//userProfileEntity.setReservationList(userProfile.getReservationList());

	}
		return UserProfileUtils.convertUserProfileEntityToUserProfile(userProfileEntity);
	}
		
//	public List<UserProfile> getUserProfilesByRoute(String route) {
//		List<UserProfileEntity> userEntityList = userProfileRepository.getById(route);
//		return UserProfileUtils.convertUserProfileEntityListToUserProfileList(userEntityList);
//	}

	public List<Long> getUserProfilesByRoute(Long routeId) {
		RouteEntity routeEntity = routeRepository.getByRouteId(routeId);
		if(routeEntity!=null) {
			List<ReservationEntity> reservationEntityList= reservationRepository.findByRouteEntity(routeEntity);
			List<UserProfileEntity> userCredentialEntity= reservationEntityList.stream().map((ele)->ele.getUserProfileEntity()).collect(Collectors.toList());
			List<Long> userList = userCredentialEntity.stream().map(user->user.getUserId()).collect(Collectors.toList());
			//Lists<UserProfile> = userProfileRepository.findAll().stream().filter((user)->user.get
			return userList;
			
		}
		else {
			return null;
		}
		
	}

	@RequestMapping(value="/vehicle",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addNewVehicleDetails(@RequestBody Vehicle vehicle) {
		admincredentialsservice.saveVehicleDetails(vehicle);
	}
	@RequestMapping(value="/route",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addNewRouteDetails(@RequestBody Route route) {
		admincredentialsservice.saveRouteDetails(route);
	}

	@RequestMapping(value="/driver",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addNewDriverDetails(@RequestBody Driver driver) {
		admincredentialsservice.saveDriverDetails(driver);
	}

	@RequestMapping(value="/vehicle/{vehicleid}",method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Vehicle updateVehicleDetails(@RequestHeader String authtoken,@PathVariable(name ="vehicleid") long vehicleId) {
		return admincredentialsservice.updateByVehicleId(authtoken, vehicleId);
		
	}
	@RequestMapping(value="/route/{routeid}",method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Route updateRouteDetails(@RequestHeader String authtoken,@PathVariable(name ="routeid") long routeId) {
		return admincredentialsservice.updateByRouteId(authtoken, routeId);
		
	}
	@RequestMapping(value="/driver/{driverid}",method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Driver updateDriverDetails(@RequestHeader String authtoken,@PathVariable(name ="driverId") long driverId) {
		return admincredentialsservice.updateByDriverId(authtoken,driverId);
		
	}



@RequestMapping(value="vehicle/{vehicleid}",method=RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_VALUE)
public String DeleteByVehicleid(@RequestHeader String authtoken,@PathVariable(name ="vehicleid") long vehicleid) {
	 return admincredentialsservice.deleteByVehicleid(authtoken, vehicleid);
}



	@RequestMapping(value="route/{routeid}",method=RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_VALUE)
	public String DeleteByRouteid(@RequestHeader String authtoken,@PathVariable(name ="routeid") long routeid) {
	 return admincredentialsservice.deleteByRouteid(authtoken,routeid);
	}
	
	@RequestMapping(value="driver/{driverId}",method=RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_VALUE)
	public String DeleteByDriverid(@RequestHeader String authtoken,@PathVariable(name ="driverId") long driverId) {
	 return admincredentialsservice.deleteByDriverid(authtoken,driverId);
	}
	



}