package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.VehicleEntity;
import com.spring.json.Vehicle;
import com.spring.service.AdminCredentialsService;

@RestController
@RequestMapping("/app/admin/")
public class AdminCredentialsController {
	
	@Autowired
	private AdminCredentialsService admincredentialsservice;

	@RequestMapping(value="/vehicle",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addVehicleDetails(@RequestBody Vehicle vehicle) {
		admincredentialsservice.save(vehicle);
	}
}

