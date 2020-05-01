package com.spring.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.json.ChangePassword;
import com.spring.json.Reservation;
import com.spring.json.Route; 
import com.spring.rest.repository.ReservationRepository;
import com.spring.rest.repository.RouteRepository; 
import com.spring.utils.ReservationUtils;
import com.spring.utils.RouteUtils;
 
import com.spring.entity.ReservationEntity;
import com.spring.entity.RouteEntity;
import com.spring.entity.UserProfileEntity;
import com.spring.entity.VehicleEntity;
import com.spring.json.UserProfile;
import com.spring.json.Vehicle;
import com.spring.rest.repository.UserProfileRepository;
import com.spring.rest.repository.VehicleRepository; 
import com.spring.utils.UserProfileUtils;
import com.spring.utils.VehicleUtils;


 
@Service
public class UserServiceImpl implements UserService  
{
	@Autowired
	VehicleRepository vehicleRepository;
	
	@Autowired
	RouteRepository routeRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Autowired
	UserProfileRepository userProfileRepository;
	
	@Override
	public Object getVehicleById(Long vehicleid) 
	{
		VehicleEntity vehicleEntity=vehicleRepository.getByVehicleId(vehicleid);
		if(vehicleEntity!=null)
			return VehicleUtils.convertVehicleEntityToVehicle(vehicleEntity);
		else
			return "Invalid VehicleId";
	}

	@Override
	public Object getRouteById(Long routeId)
	{
		RouteEntity routeEntity=routeRepository.getByRouteId(routeId);
		if (routeEntity!=null)
		
		return RouteUtils.convertRouteEntityToRoute(routeEntity);
		else
			return "Invalid RouteId please Check ID";
	}

	@Override
	public Object bookReservation(Reservation reservation) 
	{
		ReservationEntity reservationEntity=ReservationUtils.convertReservationToReservationEntity(reservation);
		if(reservationEntity.getUserProfileEntity().getUserId()!=0)
		{
			if (UserProfileUtils.convertUserProfileEntityToUserProfile(reservationEntity.getUserProfileEntity()).getSessionId()!=null)
			{
				ReservationEntity reservationEntitiy= reservationRepository.save(reservationEntity);
				return "Booked !! with BookingId "+reservationEntitiy.getReservationId();
			}
			else
			{
				return "User Not Logged In: Please Login First";
			}
		}
		else
		{
			return "User Not Registered";
		}
		
		
	}

	@Override
	public Object getBookingStatus(Long reservationId) {
		ReservationEntity reservationEntity = reservationRepository.findById(reservationId).get();
		if(reservationEntity!=null)
		{
			if(reservationEntity.getBookingStatus()!=null)
			{
				return "Booking Status "+reservationEntity.getBookingStatus()+" Driver Details "+reservationEntity.getDriverEntity() +
						" Boarding Point "+reservationEntity.getBoardingPoint()+" Drop Point "+reservationEntity.getDropPoint();
			}
		}
		{
			return "Invalid Booking Id ..Please Book Ticket !!";
		}
	}

	@Override
	public Object cancelBooking(Long reservationId) 
	{
		
		if(reservationRepository.existsById(Long.valueOf(reservationId))) 
		{
			
		
		ReservationEntity reservationEntity= reservationRepository.findById(reservationId).get();
		LocalDate date=LocalDate.now();
		LocalDate journeyDate=reservationEntity.getJourneyDate();
		boolean isAfter = date.isAfter(journeyDate);
		if(isAfter)
		{
			return "Cancel Denied --- Journey Date Expired";
		}
		else
		{
			reservationRepository.deleteById(Long.valueOf(reservationId));
			return "Cancel Sucessful -- But Money Will not be Refunded";
		}
		
		
		}
		else
			return "Invalid BookingId";
	}

	@Override
	public Object changePassword(ChangePassword requestedPassword) 
	{
		UserProfileEntity userProfileEntity = userProfileRepository.findByPassword(requestedPassword.getOldPassword());
		if (userProfileEntity!=null)
		{
			userProfileEntity.setPassword(requestedPassword.getNewPassword());
			userProfileRepository.save(userProfileEntity);
			return "Password Changed Sucessfully";
		}
		else
		{
			return "Incorrect Password... Try again";
		}
	}
	
	
}



