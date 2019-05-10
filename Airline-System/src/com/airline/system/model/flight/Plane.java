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

	public Map getSeatMap() {
		return seatMap;
	}

	public void setSeatMap(Map seatMap) {
		this.seatMap = seatMap;
	}

	public String getPlaneNumber() {
		return planeNumber;
	}

	public void setPlaneNumber(String planeNumber) {
		this.planeNumber = planeNumber;
	}
	
	

}
