
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
		return new Reservation(reservationEntity.getReservationId(), reservationEntity.getBookingDate(),reservationEntity.getJourneyDate(),reservationEntity.getBookingStatus(),reservationEntity.getTotalFare(),reservationEntity.getBoardingPoint(),reservationEntity.getDropPoint());
	}

	public static ReservationEntity convertReservationToReservationEntity(Reservation reservation) {
		return new ReservationEntity( reservation.getBookingDate(),reservation.getJourneyDate(),reservation.getBookingStatus(),reservation.getTotalFare(),reservation.getBoardingPoint(),reservation.getDropPoint());
		}

	public static List<ReservationEntity> convertReservationListToReservationEntityList(
			List<Reservation> reservationList) {
		List<ReservationEntity> reservationEntityList = new ArrayList<ReservationEntity>();
		Consumer<Reservation> consumer = (Reservation reservation)->reservationEntityList.add(convertReservationToReservationEntity(reservation));
		reservationList.stream().forEach(consumer);
		
		return reservationEntityList;
	}
}
