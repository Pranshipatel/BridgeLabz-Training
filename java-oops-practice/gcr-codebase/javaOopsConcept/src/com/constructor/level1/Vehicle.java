package com.constructor.level1;

public class Vehicle {
	// Attribute
	String ownerName;
	String vehicleType;
	static int registrationFee = 2000;
	
	Vehicle(String ownerName, String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	void displayVehicleDetails() {
		System.out.println("Owner Name = " + ownerName);
		System.out.println("Vehicle Type = " + vehicleType);
		System.out.println("Registration Fee = " + registrationFee);
		System.out.println("---------------------------------------");
	}
	
	static void updateRegistrationFee(int updatedFee) {
		registrationFee = updatedFee;
	}
	
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Pranshi", "Car");
		v1.displayVehicleDetails();
		
		// update registration fees
		Vehicle.updateRegistrationFee(2500);
		v1.displayVehicleDetails();
	}

}
