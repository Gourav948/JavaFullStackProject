package com.spring.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.ReservationEntity;
import com.spring.entity.RouteEntity;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {

	List<ReservationEntity> findByRouteEntity(RouteEntity routeEntity);

}
