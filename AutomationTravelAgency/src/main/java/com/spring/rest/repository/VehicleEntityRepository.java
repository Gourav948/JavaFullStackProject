package com.spring.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.spring.entity.VehicleEntity;

@Component
public interface VehicleEntityRepository extends JpaRepository<VehicleEntity,Long>{
	
	
	List<VehicleEntity> findByVehicleId(long vehicleid);
	void deleteByVehicleId(long vehicleid);

}
