package com.inheritance.basics.vehicleandtransport;

class Truck extends Vehicle{
	
	public Truck(int maxSpeed, String fuelType) {
		super(maxSpeed, fuelType);
		
	}
	
	void displayInfo() {
		System.out.println("Max Speed of Car = " + maxSpeed);
		System.out.println("Fuel Type of Car = " + fuelType);
		
	}
}
