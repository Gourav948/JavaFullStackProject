package com.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.UserCredentialsService;
import com.spring.service.UserService;
import com.spring.json.Route;
import com.spring.json.UserCredentials;
import com.spring.json.Vehicle;

@RestController
@RequestMapping("/app")
public class UserController 
{
	@Autowired
	UserService userService;
	 		
	@PostMapping(value="/vehicle/{vehicleId}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Object getVehicleById(@PathVariable(name ="vehicleid") Long vehicleid){
		return userService.getVehicleById(vehicleid);
	}	
	@PostMapping(value="/route/{routeId}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Object getRouteById(@PathVariable(name ="routeId") Long routeId){
		return userService.getRouteById(routeId);
	}
	
}

