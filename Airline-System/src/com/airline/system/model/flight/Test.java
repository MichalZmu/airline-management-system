package com.airline.system.model.flight;

public class Test {

	public static void main(String[] args) {
		
		Plane myFirstPlane = new Plane("Boing 222-111", 3, 3, 1);
		Flight myFirstFlight = new Flight("Lot 111", myFirstPlane, "Wieden", "Krakow");
		
		
		myFirstFlight.reserveRandomSeat();
		myFirstFlight.reserveRandomSeat();
		myFirstFlight.reserveRandomSeat();
		myFirstFlight.reserveRandomSeat();
		myFirstFlight.reserveRandomSeat();
		
		myFirstFlight.showEmptySeats();
		
		myFirstFlight.reserveChosenSeat("10A");
		myFirstFlight.releaseGivenSeat("10A");
		
		myFirstFlight.showEmptySeats();

		
		

		
		

	}

}
