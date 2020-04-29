package com.spring.service;

import com.spring.entity.VehicleEntity;


public interface AdminCredentialsService {

	public	void save(VehicleEntity vehicleentity);

	public AdminCredentialsServiceImpl autoLogout(String authToken);

}
