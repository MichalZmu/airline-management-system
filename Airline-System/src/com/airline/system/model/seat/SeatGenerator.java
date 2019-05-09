package com.airline.system.model.seat;

import java.util.TreeMap;

public class SeatGenerator {
	
	public static TreeMap createSeats(int rows, int seatsInRow, int firstRowNumber) {
		
		TreeMap<String, Seat> seatMap = new TreeMap<>();
		//TreeSet<Seat> seatMap = new TreeSet<>();
		int rowsLimiter = firstRowNumber + rows;
		for(Integer i=firstRowNumber;i<rowsLimiter;i++) {
			char charIteration = 'a';
			for(Integer j=0;j<seatsInRow;j++) {
				StringBuilder sB = new StringBuilder();
				sB.append(i);
				sB.append(charIteration);
				charIteration++;
				
				seatMap.put(sB.toString(), new Seat(sB.toString()));
				//seatMap.add(new Seat(sB.toString()));
				
				
			}
		}
		
		return seatMap;
	}

}
