package com.spring.rest.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.entity.DriverEntity;
import com.spring.entity.VehicleEntity;
import com.spring.json.Vehicle;
 

@Component
public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> 
{

	void deleteById(long vehicleid);

	VehicleEntity getByVehicleId(long vehicleid);

	List<VehicleEntity> findByVehicleId(long vehicleid);

	void deleteByVehicleId(long vehicleid);

	VehicleEntity findByVehicleid(long vehicleid);


	
	

}
