package com.inheritance.basics.vehicleandtransport;

public class Vehicle {
	int maxSpeed;
	String fuelType;
	
	public Vehicle(int maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	void displayInfo() {
		System.out.println("Max Speed = " + maxSpeed);
		System.out.println("Fuel Type = " + fuelType);
	}
	

}
