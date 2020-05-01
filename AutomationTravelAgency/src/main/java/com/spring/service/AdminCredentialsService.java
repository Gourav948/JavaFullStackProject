
package com.spring.service;
import java.util.List;

import com.spring.json.Driver;
import com.spring.json.Route;
import com.spring.json.Vehicle;


public interface AdminCredentialsService {
	
	public void saveDriverDetails(String authtoken,Driver driver);


	public	void saveVehicleDetails(String authtoken,Vehicle vehicle);

	public void saveRouteDetails(String authtoken,Route route);

	public String deleteByVehicleid(String authtoken, long vehicleid);

	public String deleteByRouteid(String authtoken, long routeid);

	public String deleteByDriverid(String authtoken, long driverId);

	public Vehicle updateByVehicleId(String authtoken,Vehicle vehicle, long vehicleId);

	public Route updateByRouteId(String authtoken,Route route, long routeId);

	public Driver updateByDriverId(String authtoken,Driver driver, long driverId);

	public Vehicle getVehicleByVechicleid(long vehicleId);

	public Route getRouteByRouteid(long routeId);

	public List<Vehicle> getAllVehicles();

	public List<Route> getAllRoutes();

	

}
