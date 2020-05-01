package com.spring.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.ReservationEntity;
import com.spring.entity.RouteEntity;
import com.spring.entity.UserProfileEntity;
import com.spring.json.Driver;
import com.spring.json.Reservation;
import com.spring.json.Route;
import com.spring.json.UserProfile;
import com.spring.json.Vehicle;
import com.spring.rest.repository.ReservationRepository;
import com.spring.rest.repository.RouteRepository;
import com.spring.rest.repository.UserProfileRepository;
import com.spring.service.AdminCredentialsService;
import com.spring.utils.UserProfileUtils;

@RestController
@RequestMapping("/app")
public class AdminCredentialsController {
	
	@Autowired
	private AdminCredentialsService admincredentialsservice;
	private UserProfileRepository userProfileRepository;
	

	
	@PutMapping(value="/reservation/{reservationId}",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE )
	public List<UserProfile> allotDriver(@PathVariable(name ="reservationId") String reservationId)
	{
		return admincredentialsservice.allotDriver(reservationId);
	}
	
		
//	public List<UserProfile> getUserProfilesByRoute(String route) {
//		List<UserProfileEntity> userEntityList = userProfileRepository.getById(route);
//		return UserProfileUtils.convertUserProfileEntityListToUserProfileList(userEntityList);
//	}
	
	@GetMapping(value="/user/onDate/{date}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserProfile> getUserProfilesOnDate(@PathVariable (value="date") @DateTimeFormat(iso=ISO.DATE) LocalDate date)
	{
		return admincredentialsservice.getUserProfileOnDate(date);
		
	}
	@GetMapping(value="/user/afterDate/{date}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserProfile> getUserProfilesAfterDate(@PathVariable (value="date") @DateTimeFormat(iso=ISO.DATE) LocalDate date)
	{
		return admincredentialsservice.getUserProfileAfterDate(date);
		
	}
	@GetMapping(value="/user/beforeDate/{date}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserProfile> getUserProfilesBeforeDate(@PathVariable (value="date") @DateTimeFormat(iso=ISO.DATE) LocalDate date)
	{
		return admincredentialsservice.getUserProfileBeforeDate(date);
		
	}
	
	
	@GetMapping(value="/user/route/{routeId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<UserProfile> getUserProfilesByRoute(String routeId) 
	{
		return admincredentialsservice.getUserProfilesByRoute(Long.parseLong(routeId));
		
	}

	@RequestMapping(value="/vehicle",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addNewVehicleDetails(@RequestHeader String authtoken,@RequestBody Vehicle vehicle) {
		admincredentialsservice.saveVehicleDetails(authtoken,vehicle);
	}
	@RequestMapping(value="/route",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addNewRouteDetails(@RequestHeader String authtoken,@RequestBody Route route) {
		admincredentialsservice.saveRouteDetails(authtoken,route);
	}

	@RequestMapping(value="/driver",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addNewDriverDetails(@RequestHeader String authtoken,@RequestBody Driver driver) {
		admincredentialsservice.saveDriverDetails(authtoken,driver);
	}


	@RequestMapping(value="/vehicle/{vehicleId}",method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Vehicle updateVehicleDetails(@RequestHeader String authtoken,@RequestBody Vehicle vehicle ,@PathVariable(name ="vehicleId") String vehicleId) {
		return admincredentialsservice.updateByVehicleId(authtoken,vehicle, Long.parseLong(vehicleId));
		
	}
	@RequestMapping(value="/route/{routeId}",method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Route updateRouteDetails(@RequestHeader String authtoken,@RequestBody Route route,@PathVariable(name ="routeId") String routeId) {
		return admincredentialsservice.updateByRouteId(authtoken,route, Long.parseLong(routeId));
		
	}
	@RequestMapping(value="/driver/{driverId}",method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Driver updateDriverDetails(@RequestHeader String authtoken,@RequestBody Driver driver,@PathVariable(name ="driverId") String driverId) {
		return admincredentialsservice.updateByDriverId(authtoken,driver,Long.parseLong(driverId));
		
	}


@RequestMapping(value="vehicle/{vehicleId}",method=RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_VALUE)
public String DeleteByVehicleid(@RequestHeader String authtoken,@PathVariable(name ="vehicleId") String vehicleid) {
	 return admincredentialsservice.deleteByVehicleid(authtoken, Long.parseLong(vehicleid));
}


	@RequestMapping(value="route/{routeId}",method=RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_VALUE)
	public String DeleteByRouteid(@RequestHeader String authtoken,@PathVariable(name ="routeId") String routeid) {
	 return admincredentialsservice.deleteByRouteid(authtoken,Long.parseLong(routeid));
	}
	
	@RequestMapping(value="driver/{driverId}",method=RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_VALUE)
	public String DeleteByDriverid(@RequestHeader String authtoken,@PathVariable(name ="driverId") String driverId) {
	 return admincredentialsservice.deleteByDriverid(authtoken,Long.parseLong(driverId));
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value="vehicle/{vehicleId}",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Vehicle getVehicleByVechicleId(@PathVariable(value = "vehicleid") String vehicleId) {
		return admincredentialsservice.getVehicleByVechicleid(Long.parseLong(vehicleId));
	}

	@RequestMapping(value="/route/{routeId}",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Route getRouteByRouteId(@PathVariable(value = "routeId") String routeId) {
		return admincredentialsservice.getRouteByRouteid(Long.parseLong(routeId));
	}

	@RequestMapping(value="/vehicle",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Vehicle> getVehiclesByVechicleid() {
		return admincredentialsservice.getAllVehicles();
	}

	@RequestMapping(value="/route",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Route> getAllRoutesByRoutei() {
		return admincredentialsservice.getAllRoutes();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}