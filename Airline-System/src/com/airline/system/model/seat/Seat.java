package com.airline.system.model.seat;

public class Seat {
	
	private final String seatNumber;
	private Status status;
	
	public Seat(String seatNumber) {
		this.seatNumber = seatNumber;
		this.status = Status.AVAILABLE;
	}
	
	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}

	public String getSeatNumber() {
		return seatNumber;
	}



	public enum Status{
		AVAILABLE, RESERVED;
	}

}
