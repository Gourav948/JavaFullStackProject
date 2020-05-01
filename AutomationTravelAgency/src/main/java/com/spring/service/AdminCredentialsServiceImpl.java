
package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.DriverEntity;
import com.spring.entity.RouteEntity;
import com.spring.entity.UserProfileEntity;
import com.spring.entity.VehicleEntity;
import com.spring.json.Driver;
import com.spring.json.Route;
import com.spring.json.Vehicle;
import com.spring.rest.repository.DriverRepository;
import com.spring.rest.repository.RouteRepository;
import com.spring.rest.repository.UserProfileRepository;
import com.spring.rest.repository.VehicleRepository;
import com.spring.utils.DriverUtils;
import com.spring.utils.RouteUtils;
import com.spring.utils.VehicleUtils;

@Service
public class AdminCredentialsServiceImpl implements AdminCredentialsService {

	@Autowired
	private VehicleRepository vehicleRepository;
	@Autowired
	private RouteRepository routeRepository;

	@Autowired
	private DriverRepository driverRepository;
	@Autowired
	private UserProfileRepository userProfileRepository;

	@Override
	public void saveVehicleDetails(String authtoken,Vehicle vehicle) {
		UserProfileEntity userEntity=this.getUserUsingSessionId(authtoken);
		if(userEntity!=null)
		{
		VehicleEntity vehicletopersist = VehicleUtils.convertVehicleToVehicleEntity(vehicle);
		vehicleRepository.save(vehicletopersist);
		}
	}

	public void saveRouteDetails(String authtoken,Route route) {
		UserProfileEntity userEntity=this.getUserUsingSessionId(authtoken);
		if(userEntity!=null)
		{
	}
		RouteEntity routeetopersist = RouteUtils.convertRouteToRouteEntity(route);
		routeRepository.save(routeetopersist);
	}
	public void saveDriverDetails(String authtoken,Driver driver) {
		UserProfileEntity userEntity=this.getUserUsingSessionId(authtoken);
		if(userEntity!=null)
		{
	}
		DriverEntity drivertopersist=DriverUtils.convertDriverToDriverEntity(driver);
		driverRepository.save(drivertopersist);
	}

	@Override
	public String deleteByVehicleid(String authtoken,long vehicleid) 
	{
		
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
	}
	}
	

	public String deleteByRouteid(String authtoken, long routeid) {

		UserProfileEntity checkLogin = userProfileRepository.findBySessionId(authtoken).get(0);

		if (checkLogin != null) {

			RouteEntity routeToDelete = routeRepository.findByRouteid(routeid).get(0);

			if (routeToDelete != null) {
				routeRepository.deleteByRouteId(routeid);
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
	public String deleteByDriverid(String authtoken, long driverId) {

		UserProfileEntity checkLogin = userProfileRepository.findBySessionId(authtoken).get(0);

		if (checkLogin != null || authtoken != null) {

			DriverEntity driverToDelete = driverRepository.findByDriverId(driverId).get(0);
			if (driverToDelete != null) {
				driverRepository.deleteByDriverId(driverId);
				return "Driver details delete successfully";
			}

			else {
				return "driverId is invalid";
			}
		}

		else {
			return "invalid authtoken / login to perform the function";
		}
	}
	@Override
	public Vehicle updateByVehicleId(String authtoken,Vehicle vehicle, long vehicleId)
	{
		//UserProfileEntity checklogin=userProfileRepository.findBySessionId(authtoken).get(0);
		UserProfileEntity checklogin=this.getUserUsingSessionId(authtoken);
		if(checklogin!=null ) {	
			
			VehicleEntity vehicletoupdate=vehicleRepository.
					findByVehicleId(vehicleId).get(0);
			if(vehicletoupdate!=null)
			{
				vehicletoupdate.setName(vehicle.getName());
				vehicletoupdate.setType(vehicle.getType());
				vehicletoupdate.setRegistrationNumber(vehicle.getRegistrationNumber());
				vehicletoupdate.setSeatingCapacity(vehicle.getSeatingCapacity());
				vehicletoupdate.setFarePerKm(vehicle.getFarePerKm());
				vehicletoupdate = vehicleRepository.save(vehicletoupdate);
				return VehicleUtils.convertVehicleEntityToVehicle(vehicletoupdate);
			}
			else
			{
			return null;
			}}
		return null;
			
		}
			
	@Override
	public Route updateByRouteId(String authtoken,Route route, long routeId)
	{
		//UserProfileEntity checklogin=userProfileRepository.findBySessionId(authtoken).get(0);
		UserProfileEntity checklogin=this.getUserUsingSessionId(authtoken);
		if(checklogin!=null ) {	
			
		
			RouteEntity routetoupdate=routeRepository.
					findByRouteId(routeId);
			if(routetoupdate!=null)
			{
				routetoupdate.setSource(route.getSource());
				routetoupdate.setDestination(route.getDestination());
				routetoupdate.setDistance(route.getDistance());
				routetoupdate.setTravelDuration(route.getTravelDuration());
				routetoupdate = routeRepository.save(routetoupdate);
				return RouteUtils.convertRouteEntityToRoute(routetoupdate);
			}
			return null;
		}
		else { 
			return null;
	}}
	@Override
	public Driver updateByDriverId(String authtoken,Driver driver, long driverId)
	{
//UserProfileEntity checklogin=userProfileRepository.findBySessionId(authtoken).get(0);
UserProfileEntity checklogin=this.getUserUsingSessionId(authtoken);
if(checklogin!=null ) {	
		
		
			DriverEntity drivertoupdate=driverRepository.
					findByDriverId(driverId).get(0);
			if(drivertoupdate!=null)
			{
				drivertoupdate.setFirstName(driver.getName());
				drivertoupdate.setStreet(driver.getStreet());
				drivertoupdate.setLocation(driver.getLocation());
				drivertoupdate.setCity(driver.getCity());
				drivertoupdate.setState(driver.getState());
				drivertoupdate.setPincode(driver.getPincode());
				drivertoupdate.setMobileNo(driver.getMobileNo());
				drivertoupdate.setLicenseNumber(driver.getLicenseNumber());
				drivertoupdate = driverRepository.save(drivertoupdate);
				return DriverUtils.convertDriverEntityToDriver(drivertoupdate);
			}
			else
			{
			return null;
		}}
		else { return null; }
	}



	@Override
	public Vehicle getVehicleByVechicleid(long vehicleId) {
		return VehicleUtils.convertVehicleEntityToVehicle(vehicleRepository.findByVehicleid(vehicleId));
	}

	@Override
	public Route getRouteByRouteid(long routeId) {
		return RouteUtils.convertRouteEntityToRoute(routeRepository.findByRouteId(routeId));
	}

	@Override
	public List<Vehicle> getAllVehicles() {
		return VehicleUtils.convertVehicleEntityListToVehicleList(vehicleRepository.findAll());
	}

	@Override
	public List<Route> getAllRoutes() {
		return RouteUtils.convertRouteEntityListToRouteList(routeRepository.findAll());
	}
	public  UserProfileEntity getUserUsingSessionId(String authtoken)
	{
		if(authtoken==null||authtoken.equals(""))
		{
			return null;
		}
		UserProfileEntity userprofileentity=userProfileRepository.findBySessionId(authtoken).get(0);
		if(userprofileentity==null)
		{
			return null;
		}
		else
		{
			return userprofileentity;
		}
	}
}
