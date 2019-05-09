package com.airline.system.model.flight;

import java.util.Map;

import com.airline.system.model.seat.SeatGenerator;

public class Plane {
	
	private Map seatMap;
	private String planeNumber;
	
	public Plane(String planeNumber, int rows, int seatsInRow, int firstRowNumber) {
		this.planeNumber = planeNumber;
		this.seatMap = SeatGenerator.createSeats(rows, seatsInRow, firstRowNumber);
	}

}
