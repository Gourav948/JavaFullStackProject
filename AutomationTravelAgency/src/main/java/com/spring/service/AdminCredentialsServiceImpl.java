package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.VehicleEntity;
import com.spring.json.Vehicle;
import com.spring.rest.repository.VehicleEntityRepository;
import com.spring.utils.VehicleUtils;

@Service
public class AdminCredentialsServiceImpl implements AdminCredentialsService {
	
	@Autowired
	private VehicleEntityRepository admincredentialsrepository;
	@Override
	public void save(Vehicle vehicle){
	VehicleEntity vehicletopersist=VehicleUtils.convertVehicleToVehicleEntity(vehicle);
	admincredentialsrepository.save(vehicletopersist);
	}
}
