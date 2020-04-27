package com.spring.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.spring.entity.VehicleEntity;
import com.spring.json.Vehicle;
 

public class VehicleUtils 
{
	public static List<Vehicle> convertVehicleEntityListToVehicleList(List<VehicleEntity> vehicleEntityList) {
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		Consumer<VehicleEntity> consumer = (VehicleEntity vehicleEntity)->vehicleList.add(convertVehicleEntityToVehicle(vehicleEntity));
		vehicleEntityList.stream().forEach(consumer);
		return vehicleList;
	}
	
	public static Vehicle convertVehicleEntityToVehicle(VehicleEntity vehicleEntity) {
		return new Vehicle(vehicleEntity.getVehicleId(),vehicleEntity.getName(),vehicleEntity.getType(),vehicleEntity.getRegistrationNumber(),
				vehicleEntity.getSeatingCapacity(),vehicleEntity.getFarePerKm());
	}

	public static VehicleEntity convertVehicleToVehicleEntity(Vehicle vehicle) {
		return new VehicleEntity(vehicle.getName(),vehicle.getType(),vehicle.getRegistrationNumber(),
				vehicle.getSeatingCapacity(),vehicle.getFarePerKm());
}
}
