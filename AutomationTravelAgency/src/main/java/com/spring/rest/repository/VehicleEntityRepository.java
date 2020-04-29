package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.entity.VehicleEntity;
@Component
public interface VehicleEntityRepository extends JpaRepository<VehicleEntity,Long>{

	void deleteByVehicleId(Long vehicleid);

}
