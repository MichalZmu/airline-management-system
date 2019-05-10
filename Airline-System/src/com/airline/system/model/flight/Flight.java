package com.airline.system.model.flight;

import java.util.Map;

public class Flight {
	
	private final String flightNumber;
	private Plane planeNumber;
	private final String destination;
	private final String origin;
	private TreeMap<String, Seat> = new TreeMap()<>;
	
	public Flight(String flightNumber, Plane planeNumber, String destination, String origin) {
		this.flightNumber = flightNumber;
		this.planeNumber = planeNumber;
		this.destination = destination;
		this.origin = origin;
	}

}
