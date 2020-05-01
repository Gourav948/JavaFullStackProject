

package com.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.DriverEntity;
import com.spring.entity.RouteEntity;
import com.spring.entity.UserCredentialsEntity;
import com.spring.entity.VehicleEntity;
import com.spring.json.Driver;
import com.spring.json.Route;
import com.spring.json.Vehicle;
import com.spring.rest.repository.DriverEntityRepository;
import com.spring.rest.repository.DriverRepository;
import com.spring.rest.repository.RouteEntityRepository;
import com.spring.rest.repository.UserCredentialsRepository;
import com.spring.rest.repository.VehicleEntityRepository;
import com.spring.utils.DriverUtils;
import com.spring.utils.RouteUtils;
import com.spring.utils.VehicleUtils;


@Service
public class AdminCredentialsServiceImpl implements AdminCredentialsService {

	@Autowired
	private DriverEntityRepository driverentityrepository;
	
	@Autowired
	private VehicleEntityRepository vehicleentityrepository;
	@Autowired
	private RouteEntityRepository routeentityrepository;
	
	@Autowired
	private  DriverRepository driverRepository;
	@Autowired
	private UserCredentialsRepository usercredentialsRepository;
	
	
	
	@Override
	public void saveVehicleDetails(Vehicle vehicle){
	VehicleEntity vehicletopersist=VehicleUtils.convertVehicleToVehicleEntity(vehicle);
	vehicleentityrepository.save(vehicletopersist);
	}
	public void saveRouteDetails(Route route) {
	RouteEntity routeetopersist=RouteUtils.convertRouteToRouteEntity(route);
	routeentityrepository.save(routeetopersist);
	}
	public void saveDriverDetails(Driver driver) {
		DriverEntity drivertopersist=DriverUtils.convertDriverToDriverEntity(driver);
		driverentityrepository.save(drivertopersist);
			}
	
	
	@Override
	public String deleteByVehicleid(String authtoken,long vehicleid) {
		UserCredentialsEntity checklogin=usercredentialsRepository.findBySessionId(authtoken).get(0);
		
	if(checklogin!=null  || authtoken!=null ) {	
		
		VehicleEntity vehicletodelete=vehicleentityrepository.
				findByVehicleId(vehicleid).get(0);
		if (vehicletodelete!=null)
			
		{
			vehicleentityrepository.deleteByVehicleId(vehicleid);
			return "Vehicle Deleted";
		}
		else 
			
		{
			return "Vehicleid is invalid";
		}
		
	}
	
	else {
		return "invalid authtoken / login to perform the function";
	}
	}
	
	
	@Override
	public String deleteByRouteid(String authtoken,long routeid) {
		
		UserCredentialsEntity checklogin=usercredentialsRepository.findBySessionId(authtoken).get(0);
		
		if(checklogin!=null || authtoken!=null ) {	
		
		RouteEntity routetodelete=routeentityrepository.findByRouteId(routeid).get(0);
		if(routetodelete!=null)
		{
			routeentityrepository.deleteByRouteId(routeid);
			return "Route delete successfully";
		}
		
		else {
			return " Invalid routeid";
		}
		
		}

		else {
			return "invalid authtoken / login to perform the function";
		}
		
	}
	
	
	@Override
	public String deleteByDriverid(String authtoken,long driverId) {
		
UserCredentialsEntity checklogin=usercredentialsRepository.findBySessionId(authtoken).get(0);
		
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

}
 