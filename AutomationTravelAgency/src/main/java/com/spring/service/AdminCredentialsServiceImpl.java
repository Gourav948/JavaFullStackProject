
package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.RouteEntity;
import com.spring.entity.VehicleEntity;
import com.spring.json.Driver;
import com.spring.json.Route;
import com.spring.json.Vehicle;
import com.spring.rest.repository.DriverRepository;
import com.spring.rest.repository.RouteRepository;
import com.spring.rest.repository.UserProfileRepository;
import com.spring.rest.repository.VehicleRepository;
import com.spring.utils.RouteUtils;
import com.spring.utils.VehicleUtils;


@Service
public class AdminCredentialsServiceImpl implements AdminCredentialsService {

	
	@Autowired
	private VehicleRepository vehicleRepository;
	@Autowired
	private RouteRepository routeRepository;
	
	@Autowired
	private  DriverRepository driverRepository;
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	
	
	@Override
	public void saveVehicleDetails(Vehicle vehicle){
	VehicleEntity vehicletopersist=VehicleUtils.convertVehicleToVehicleEntity(vehicle);
	vehicleRepository.save(vehicletopersist);
	}
	public void saveRouteDetails(Route route) {
	RouteEntity routeetopersist=RouteUtils.convertRouteToRouteEntity(route);
	routeRepository.save(routeetopersist);
	}
	
	
	@Override
	public String deleteByVehicleid(String authtoken,long vehicleid) 
	{
		/*
		UserProfileEntity checklogin=userProfileRepository.findBySessionId(authtoken).get(0);
		
	if(checklogin!=null  || authtoken!=null ) {	
		
		VehicleEntity vehicletodelete=vehicleRepository.findByVehicleId(vehicleid).get(0);
		if (vehicletodelete!=null)
			
		{
			vehicleRepository.deleteByVehicleId(vehicleid);
			return "Vehicle Deleted";
		}
		else 
			
		{
			return "Vehicleid is invalid";
		}
		
	}
	
	else {
		return "invalid authtoken / login to perform the function";
	}*/
		return null;
	}
	
	
	@Override
	public String deleteByRouteid(String authtoken,long routeid) {
		/*
		UserProfileEntity checklogin=userProfileRepository.findBySessionId(authtoken).get(0);
		
		if(checklogin!=null || authtoken!=null ) {	
		
		RouteEntity routetodelete=routeRepository.findByRouteId(routeid);
		if(routetodelete!=null)
		{
			routeRepository.deleteByRouteId(routeid);
			return "Route delete successfully";
		}
		
		else {
			return " Invalid routeid";
		}
		
		}

		else {
			return "invalid authtoken / login to perform the function";
		}*/
		return null;
	}
	
	
	@Override
	public String deleteByDriverid(String authtoken,long driverId) {
		/*
		
UserProfileEntity checklogin=userProfileRepository.findBySessionId(authtoken).get(0);
		
		if(checklogin!=null || authtoken!=null) {
		
		DriverEntity drivertodelete=driverRepository.findByDriverId(driverId).get(0);
		if(drivertodelete!=null)
		{
			driverRepository.deleteByDriverId(driverId);
			return "Driver details delete successfully";
		}
		
		else 
		{
			return "driverId is invalid";
		}
		}
	
		else {
			return "invalid authtoken / login to perform the function";
		}
		
		

	}	*/
		return null;

}
	@Override
	public Vehicle updateByVehicleId(String authtoken, long vehicleId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Route updateByRouteId(String authtoken, long routeId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Driver updateByDriverId(String authtoken, long driverId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void saveDriverDetails(Driver driver) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	@Override
	public Vehicle getVehicleByVechicleid(long vehicleId) {
		return VehicleUtils.convertVehicleEntityToVehicle(
				vehicleRepository.findByVehicleid(vehicleId));
	}
	@Override
	public Route getRouteByRouteid(long routeId) {
		return RouteUtils.convertRouteEntityToRoute(
				routeRepository.findByRouteId(routeId));
	}
	@Override
	public List<Vehicle> getAllVehiclesByVechicleid(long vehicleId) {
		return VehicleUtils.convertVehicleEntityListToVehicleList(
				vehicleRepository.findByVehicleId(vehicleId));
	}
	@Override
	public List<Route> getAllRoutesByRouteid(long routeId) {
		return RouteUtils.convertRouteEntityListToRouteList(
				routeRepository.findByRouteid(routeId));
	}
}


