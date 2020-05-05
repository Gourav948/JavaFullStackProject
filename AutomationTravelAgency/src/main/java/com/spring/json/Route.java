package com.spring.json;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
 

public class Route 
{ 
	private long routeId; 
	private String  source; 
	private String destination; 
	private int distance; 
	private int travelDuration;
	@OneToMany(cascade={CascadeType.PERSIST}, 
			fetch=FetchType.LAZY, mappedBy = "userCredentialsEntity")
	private Set<Reservation> reservationList;
	
	public Route() {
		super();
		 
	}

	public Route(long routeId, String source, String destination, int distance, int travelDuration) {
		super();
		this.routeId = routeId;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.travelDuration = travelDuration;
	}

	public Route(long routeId, String source, String destination, int distance, int travelDuration,
			Set<Reservation> reservationList) {
		super();
		this.routeId = routeId;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.travelDuration = travelDuration;
		this.reservationList = reservationList;
	}

	public long getRouteId() {
		return routeId;
	}

	public void setRouteId(long routeId) {
		this.routeId = routeId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getTravelDuration() {
		return travelDuration;
	}
	public void setTravelDuration(int travelDuration) {
		this.travelDuration = travelDuration;
	}

	public Set<Reservation> getReservationList() {
		return reservationList;
	}

	public void setReservationList(Set<Reservation> reservationList) {
		this.reservationList = reservationList;
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", source=" + source + ", destination=" + destination + ", distance="
				+ distance + ", travelDuration=" + travelDuration + ", reservationList=" + reservationList + "]";
	}
 
	
	
}
