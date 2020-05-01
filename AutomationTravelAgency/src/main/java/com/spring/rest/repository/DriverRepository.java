package com.spring.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.DriverEntity;

public interface DriverRepository extends JpaRepository<DriverEntity, Long> {
	
	List<DriverEntity> findByDriverId(long driverId);
	void deleteByDriverId(long driverId);

}
