package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.json.Reservation;
import com.spring.json.Route;
import com.spring.json.UserCredentials;
import com.spring.rest.repository.ReservationRepository;
import com.spring.rest.repository.RouteRepository;
import com.spring.rest.repository.UserCredentialsRepository;
import com.spring.utils.ReservationUtils;
import com.spring.utils.RouteUtils;
import com.spring.utils.UserCredentialsUtils;
import com.spring.entity.ReservationEntity;
import com.spring.entity.RouteEntity;
import com.spring.entity.UserProfileEntity;
import com.spring.entity.VehicleEntity;
import com.spring.json.UserProfile;
import com.spring.json.Vehicle;
import com.spring.rest.repository.UserProfileRepository;
import com.spring.rest.repository.VehicleRepository;
import com.spring.rest.repository.UserCredentialsRepository;
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
	
	@Override
	public Object getVehicleById(Long vehicleid) 
	{
		VehicleEntity vehicleEntity=vehicleRepository.getById(vehicleid);
		if(vehicleEntity!=null)
			return VehicleUtils.convertVehicleEntityToVehicle(vehicleEntity);
		else
			return "Invalid VehicleId";
	}

	@Override
	public Object getRouteById(Long routeId)
	{
		RouteEntity routeEntity=routeRepository.getById(routeId);
		if (routeEntity!=null)
		
		return RouteUtils.convertRouteEntityToRoute(routeEntity);
		else
			return "Invalid RouteId please Check ID";
	}

	@Override
	public Object bookReservation(Reservation reservation) 
	{
		ReservationEntity reservationEntity=ReservationUtils.convertReservationToReservationEntity(reservation);
		if(reservationEntity.getUserCredentialsEntity().getUserId()!=0)
		{
			if (reservationEntity.getUserCredentialsEntity().getSessionId()!=null)
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
 



	
}



