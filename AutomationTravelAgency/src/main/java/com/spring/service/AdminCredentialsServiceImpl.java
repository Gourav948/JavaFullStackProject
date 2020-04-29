package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.RouteEntity;
import com.spring.entity.VehicleEntity;
import com.spring.json.Route;
import com.spring.json.Vehicle;
import com.spring.rest.repository.RouteEntityRepository;
import com.spring.rest.repository.VehicleEntityRepository;
import com.spring.utils.RouteUtils;
import com.spring.utils.VehicleUtils;

@Service
public class AdminCredentialsServiceImpl implements AdminCredentialsService {
	
	@Autowired
	private VehicleEntityRepository vehicleentityrepository;
	@Autowired
	private RouteEntityRepository routeentityrepository;
	
	@Override
	public void saveVehicleDetails(Vehicle vehicle){
	VehicleEntity vehicletopersist=VehicleUtils.convertVehicleToVehicleEntity(vehicle);
	vehicleentityrepository.save(vehicletopersist);
	}
	public void saveRouteDetails(Route route) {
	RouteEntity routeetopersist=RouteUtils.convertRouteToRouteEntity(route);
	routeentityrepository.save(routeetopersist);
	}

}
