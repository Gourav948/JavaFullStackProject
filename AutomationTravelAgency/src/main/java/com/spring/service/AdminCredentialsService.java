
package com.spring.service;
import java.time.LocalDate;
import java.util.List;

import com.spring.json.Driver;
import com.spring.json.Route;
import com.spring.json.UserProfile;
import com.spring.json.Vehicle;


public interface AdminCredentialsService {
	
	public Object saveDriverDetails(String authtoken,Driver driver);


	public	Object saveVehicleDetails(String authtoken,Vehicle vehicle);

	public Object saveRouteDetails(String authtoken,Route route);

	public Object deleteByVehicleid(String authtoken, long vehicleid);

	public Object deleteByRouteid(String authtoken, long routeid);

	public Object deleteByDriverid(String authtoken, long driverId);

	public Object updateByVehicleId(String authtoken,Vehicle vehicle, long vehicleId);

	public Object updateByRouteId(String authtoken,Route route, long routeId);

	public Object updateByDriverId(String authtoken,Driver driver, long driverId);

	public Vehicle getVehicleByVechicleid(long vehicleId);

	public Route getRouteByRouteid(long routeId);

	public List<Vehicle> getAllVehicles();

	public List<Route> getAllRoutes();


	public List<UserProfile> getUserProfilesByRoute(long parseLong);


	public List<UserProfile> getUserProfileOnDate(LocalDate date);


	public List<UserProfile> getUserProfileAfterDate(LocalDate date);


	public List<UserProfile> getUserProfileBeforeDate(LocalDate date);


	public List<UserProfile> allotDriver(String reservationId);

	

}
