package com.airline.system.model.flight;

import java.util.Map;
import java.util.TreeMap;

import com.airline.system.model.seat.Seat;
import com.airline.system.model.seat.Seat.Status;

public class Flight {
	
	private final String flightNumber;
	private Plane planeNumber;
	private final String destination;
	private final String origin;
	private TreeMap<String, Object> seatMap = new TreeMap<>();
	
	public Flight(String flightNumber, Plane plane, String destination, String origin) {
		this.flightNumber = flightNumber;
		this.planeNumber = plane;
		this.destination = destination;
		this.origin = origin;
		seatMap = (TreeMap<String, Object>) plane.getSeatMap();
	}
	
	
	
	public Plane getPlaneNumber() {
		return planeNumber;
	}



	public void setPlaneNumber(Plane planeNumber) {
		this.planeNumber = planeNumber;
	}



	public String getFlightNumber() {
		return flightNumber;
	}



	public String getDestination() {
		return destination;
	}



	public String getOrigin() {
		return origin;
	}



	public void showAllSeat() {
			
		for (Map.Entry<String, Object> entry : seatMap.entrySet()) {
			
		    System.out.println(entry.getKey());
		    
		}	
		
	}
	
	public void reserveRandomSet() {
		boolean noEmptySeat = true;
		for (Map.Entry<String, Object> entry : seatMap.entrySet()) {
						
		    Seat tempObject = (Seat) entry.getValue();
		    if(tempObject.isFree()) {
		    	tempObject.setStatus(Status.RESERVED);
		    	noEmptySeat = false;
		    	System.out.println("Your seat has been reserved");
			    System.out.println("Seat: " + tempObject.getSeatNumber());
			    break;
		    }
		      
		}
		if(noEmptySeat) {
			System.out.println("No empty seats, sorry.");
		}
		
		
	}

}
