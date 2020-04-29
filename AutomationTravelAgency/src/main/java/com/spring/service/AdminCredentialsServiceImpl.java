package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.RouteEntity;
import com.spring.entity.VehicleEntity;
import com.spring.json.Route;
import com.spring.json.Vehicle;
import com.spring.rest.repository.RouteRepository;
import com.spring.rest.repository.VehicleRepository;
import com.spring.utils.RouteUtils;
import com.spring.utils.VehicleUtils;

@Service
public class AdminCredentialsServiceImpl implements AdminCredentialsService {
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	RouteRepository routeRepository;
	
	@Override
	public void saveVehicleDetails(Vehicle vehicle){
	VehicleEntity vehicletopersist=VehicleUtils.convertVehicleToVehicleEntity(vehicle);
	vehicleRepository.save(vehicletopersist);
	}
	public void saveRouteDetails(Route route) {
	RouteEntity routeetopersist=RouteUtils.convertRouteToRouteEntity(route);
	routeRepository.save(routeetopersist);
	}

}
