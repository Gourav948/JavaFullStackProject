package com.spring.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.spring.entity.DriverEntity;
import com.spring.json.Driver;
 

public class DriverUtils 
{
	public static List<Driver> convertDriverEntityListToDriverList(List<DriverEntity> driverEntityList) {
		List<Driver> driverList = new ArrayList<Driver>();
		Consumer<DriverEntity> consumer = (DriverEntity driverEntity)->driverList.add(convertDriverEntityToDriver(driverEntity));
		driverEntityList.stream().forEach(consumer);
		return driverList;
	}
	
	public static Driver convertDriverEntityToDriver(DriverEntity driverEntity) {
		return new Driver(driverEntity.getDriverId(),driverEntity.getName(),driverEntity.getStreet(),driverEntity.getLocation()
					,driverEntity.getCity(),driverEntity.getState(),driverEntity.getPincode(),driverEntity.getMobileNo(),driverEntity.getLicenseNumber());
	}

	public static DriverEntity convertDriverToDriverEntity(Driver driver) {
		return new DriverEntity(driver.getName(),driver.getStreet(),driver.getLocation()
				,driver.getCity(),driver.getState(),driver.getPincode(),driver.getMobileNo(),driver.getLicenseNumber());
}
}
