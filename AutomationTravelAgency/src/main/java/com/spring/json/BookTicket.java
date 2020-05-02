package com.spring.json;

public class BookTicket 
{
	
	private long vehicleId;
	private long routeId;
	private CreditCard creditCard;
	private Reservation reservation;
	
	

	


	public BookTicket(long vehicleId, long routeId, Reservation reservation) {
		super();
		this.vehicleId = vehicleId;
		this.routeId = routeId;
		this.reservation = reservation;
	}



	public BookTicket(long vehicleId, long routeid, CreditCard creditCard, Reservation reservation) {
		super();
		this.vehicleId = vehicleId;
		this.routeId = routeId;
		this.creditCard = creditCard;
		this.reservation = reservation;
	}



	public BookTicket() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getVehicleId() {
		return vehicleId;
	}



	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}



	public long getRouteId() {
		return routeId;
	}



	public void setRouteid(long routeid) {
		this.routeId = routeid;
	}



	public CreditCard getCreditCard() {
		return creditCard;
	}



	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}



	public Reservation getReservation() {
		return reservation;
	}



	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	
	
}
