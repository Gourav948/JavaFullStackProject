package com.spring.json;

public class BookTicket 
{
	
	private long vehicleId;
	private long routeId;
	
	

	


	public BookTicket(long vehicleId, long routeId) {
		super();
		this.vehicleId = vehicleId;
		this.routeId = routeId;
		
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


	
}
