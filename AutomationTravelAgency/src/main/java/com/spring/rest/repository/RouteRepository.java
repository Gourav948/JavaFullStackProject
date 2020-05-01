package com.spring.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.RouteEntity;

public interface RouteRepository extends JpaRepository<RouteEntity, Long> {

	RouteEntity getByRouteId(Long routeId);

	void deleteByRouteId(long routeid);
	RouteEntity findByRouteId(long routeid);

}
