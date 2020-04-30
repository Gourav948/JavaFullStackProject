
package com.spring.service;
import com.spring.json.Driver;

import com.spring.entity.VehicleEntity;
import com.spring.json.Route;
import com.spring.json.Vehicle;
public interface AdminCredentialsService {

	public	void saveVehicleDetails(Vehicle vehicle);

	public void saveRouteDetails(Route route);

	public void saveDriverDetails(Driver driver);

	 public String deleteByVehicleid(Long vehicleid);

}
