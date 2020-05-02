package com.spring.rest.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.ReservationEntity;
import com.spring.entity.RouteEntity;
import com.spring.entity.UserProfileEntity;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {

	List<ReservationEntity> findByRouteEntity(RouteEntity routeEntity);

	List<ReservationEntity> findByBookingDate(LocalDate date);

	List<ReservationEntity> findByBookingDateGreaterThan(LocalDate date);

	List<ReservationEntity> findByBookingDateLessThan(LocalDate date);

	ReservationEntity findByUserProfileEntity(UserProfileEntity userProfileEntity);

}
