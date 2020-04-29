package com.spring.rest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.entity.RouteEntity;
@Component
public interface RouteEntityRepository extends JpaRepository<RouteEntity,Long> {

}
