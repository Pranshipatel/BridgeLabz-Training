package com.constructor.level1;

public class HotelBooking {
	// Attributes
	String guestName;
	String roomType;
	int nights;
	
	// Default Constructor
	HotelBooking(){
		guestName = "Pranshi Patel";
		roomType = "Premium";
		int nights = 2;
	}
	
	// Parameterized Constructor
	HotelBooking(String guestName, String roomType, int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	// Copy Constructor
	HotelBooking(HotelBooking hb){
		this.guestName = hb.guestName;
		this.roomType = hb.roomType;
		this.nights = hb.nights;
	}
	
	// Display details
	void displayHotelBooking() {
		System.out.println("Name of Guest is : " + guestName);
		System.out.println("Type of Room is : " + roomType);
		System.out.println("No of nights : " + nights);
		System.out.println("---------------------------------");
	}
	
	
	// main method
	public static void main(String[] args) {
		HotelBooking hb = new HotelBooking();  // Default Constructor
		HotelBooking hb2 = new HotelBooking("Rekha", "Economy", 1);  // Parameterized Constructor
		HotelBooking hb3 = new HotelBooking(hb2);  // Copy Constructor
		
		hb.displayHotelBooking();
		hb2.displayHotelBooking();
		hb3.displayHotelBooking();
	}
    
}
