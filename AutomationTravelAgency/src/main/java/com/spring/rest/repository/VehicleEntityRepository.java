package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.VehicleEntity;

public interface VehicleEntityRepository extends JpaRepository<VehicleEntity,Long>{

}
