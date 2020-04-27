package com.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ATA_TBL_Route")
public class RouteEntity 
{
	@Id
	@GeneratedValue
	@Column(name="ROUTEID")
	private long routeId;
	
	@Column(name="SOURCE")
	private String  source;
	
	@Column(name="DESTINATION")
	private String destination;
	
	@Column(name="DISTANCE")
	private int distance;
	
	@Column(name="TRAVELDURATION")
	private int travelDuration;
	

	public RouteEntity() {
		super();
	 
	}


	public RouteEntity(String source, String destination, int distance, int travelDuration) {
		super();
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.travelDuration = travelDuration;
	}


	public long getRouteId() {
		return routeId;
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


	@Override
	public String toString() {
		return "RouteEntity [routeId=" + routeId + ", source=" + source + ", destination=" + destination + ", distance="
				+ distance + ", travelDuration=" + travelDuration + "]";
	} 
	
	
	
	
}
