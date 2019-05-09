package com.airline.system.model.flight;

import java.util.Map;

public class Flight {
	
	private String flightNumber;
	private Plane planeNumber;
	
	public Flight(String flightNumber, Plane planeNumber) {
		this.flightNumber = flightNumber;
		this.planeNumber = planeNumber;
	}

}
