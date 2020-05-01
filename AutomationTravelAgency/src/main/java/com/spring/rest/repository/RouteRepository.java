package com.spring.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.RouteEntity;
import com.spring.json.Route;

public interface RouteRepository extends JpaRepository<RouteEntity, Long> {

	RouteEntity getByRouteId(Long routeId);

	void deleteByRouteId(long routeid);
	RouteEntity findByRouteId(long routeid);

	List<RouteEntity> findByRouteid(long routeid);

}
