package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.DriverEntity;

public interface DriverEntityRepository extends JpaRepository<DriverEntity,Long> {

}
