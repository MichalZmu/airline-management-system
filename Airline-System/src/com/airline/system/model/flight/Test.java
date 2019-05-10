package com.airline.system.model.flight;

public class Test {

	public static void main(String[] args) {
		
		Plane myFirstPlane = new Plane("Boing 222-111", 2, 2, 1);
		Flight myFirstFlight = new Flight("Lot 111", myFirstPlane, "Wieden", "Krakow");
		
		myFirstFlight.showAllSeat();
		myFirstFlight.reserveRandomSet();
		
		

	}

}
