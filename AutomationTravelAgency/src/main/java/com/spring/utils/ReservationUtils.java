package com.spring.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.spring.entity.ReservationEntity;
import com.spring.json.Reservation;
 

public class ReservationUtils 
{
	public static List<Reservation> convertReservationEntityListToReservationList(List<ReservationEntity> reservationEntityList) {
		List<Reservation> reservationList = new ArrayList<Reservation>();
		Consumer<ReservationEntity> consumer = (ReservationEntity reservationEntity)->reservationList.add(convertReservationEntityToReservation(reservationEntity));
		reservationEntityList.stream().forEach(consumer);
		return reservationList;
	}
	
	public static Reservation convertReservationEntityToReservation(ReservationEntity reservationEntity) {
		return new Reservation(reservationEntity.getReservationId(), UserCredentialsUtils.convertUserCredentialsEntityToUserCredentials(reservationEntity.getUserCredentialsEntity()),VehicleUtils.convertVehicleEntityToVehicle(reservationEntity.getVehicleEntity()),RouteUtils.convertRouteEntityToRoute(reservationEntity.getRouteEntity()),
				reservationEntity.getBookingDate(),reservationEntity.getJourneyDate(),DriverUtils.convertDriverEntityToDriver(reservationEntity.getDriverEntity()),reservationEntity.getBookingStatus(),reservationEntity.getTotalFare(),reservationEntity.getBoardingPoint(),reservationEntity.getDropPoint());
	}

	public static ReservationEntity convertReservationToReservationEntity(Reservation reservation) {
		return new ReservationEntity( UserCredentialsUtils.convertUserCredentialsToUserCredentialsEntity(reservation.getUserCredentialsEntity()),VehicleUtils.convertVehicleToVehicleEntity(reservation.getVehicleEntity()),RouteUtils.convertRouteToRouteEntity(reservation.getRouteEntity()),
				reservation.getBookingDate(),reservation.getJourneyDate(),DriverUtils.convertDriverToDriverEntity(reservation.getDriverEntity()),reservation.getBookingStatus(),reservation.getTotalFare(),reservation.getBoardingPoint(),reservation.getDropPoint());
		}
}
