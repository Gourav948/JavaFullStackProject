
package com.spring.service;

import com.spring.entity.VehicleEntity;
import com.spring.json.Driver;
import com.spring.json.Route;
import com.spring.json.Vehicle;

public interface AdminCredentialsService {

	public	void saveVehicleDetails(Vehicle vehicle);

	public void saveRouteDetails(Route route);

	public String deleteByVehicleid(String authtoken, long vehicleid);

	public String deleteByRouteid(String authtoken, long routeid);

	public String deleteByDriverid(String authtoken, long driverId);

	public Vehicle updateByVehicleId(String authtoken, long vehicleId);

	public Route updateByRouteId(String authtoken, long routeId);

	public Driver updateByDriverId(String authtoken, long driverId);

	

	

}
