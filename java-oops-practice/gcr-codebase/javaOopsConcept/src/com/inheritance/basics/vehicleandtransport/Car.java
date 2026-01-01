package com.inheritance.basics.vehicleandtransport;

class Car extends Vehicle {
	private int seatCapacity;
	
	public Car(int maxSpeed, String fuelType, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	void displayInfo() {
		System.out.println("Max Speed of Car = " + maxSpeed);
		System.out.println("Fuel Type of Car = " + fuelType);
		System.out.println("Seating Capacity of Car = " + seatCapacity);
	}
	

}
