

package com.spring.service;

import com.spring.entity.VehicleEntity;
import com.spring.json.BookTicket;
import com.spring.json.ChangePassword;
import com.spring.json.Reservation;
import com.spring.json.Route;
import com.spring.json.UserProfile;
import com.spring.json.Vehicle;

public interface UserService 
{

	Object getVehicleById(Long vehicleid);

	Object getRouteById(Long routeId);

	Object bookReservation(UserProfile userProfile,long userId);

	Object getBookingStatus(Long reservationId);

	Object cancelBooking(Long reservationId);

	Object changePassword(ChangePassword requestedPassword);

	Object confirmBooking(BookTicket bookTicket, long parseLong);

	 

}

