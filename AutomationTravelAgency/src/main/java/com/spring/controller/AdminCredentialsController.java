package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.VehicleEntity;
import com.spring.json.Route;
import com.spring.json.UserProfile;
import com.spring.json.Vehicle;
import com.spring.service.AdminCredentialsService;
import com.spring.service.UserCredentialsService;

@RestController
@RequestMapping("/app/admin/")
public class AdminCredentialsController {
	
	@Autowired
	private AdminCredentialsService admincredentialsservice;
	@Autowired
	private UserCredentialsService userCredentialsService;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	@RequestMapping(value="/vehicle",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addVehicleDetails(@RequestBody Vehicle vehicle) {
		admincredentialsservice.saveVehicleDetails(vehicle);
	}
	@RequestMapping(value="/route",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addRouteDetails(@RequestBody Route route) {
		admincredentialsservice.saveRouteDetails(route);
	}


@PostMapping(value="/app/customer", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody UserProfile registerUserProfile(@RequestBody UserProfile userProfile) {
	return userCredentialsService.save(userProfile);
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