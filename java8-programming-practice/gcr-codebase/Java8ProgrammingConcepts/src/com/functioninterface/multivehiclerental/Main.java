package com.functioninterface.multivehiclerental;

public class Main {
	public static void main(String[] args) {
		    Rent carRent = () -> System.out.println("Car rented");
		    ReturnVehicle  carReturn = () -> System.out.println("Car returned");

	        // Bike
	        Rent bikeRent = () -> System.out.println("Bike rented");
	        ReturnVehicle  bikeReturn = () -> System.out.println("Bike returned");

	        // Bus
	        Rent busRent = () -> System.out.println("Bus rented");
	        ReturnVehicle busReturn = () -> System.out.println("Bus returned");

	        // Test
	        carRent.rent();
	        carReturn.returnVehicle();

	        bikeRent.rent();
	        bikeReturn.returnVehicle();

	        busRent.rent();
	        busReturn.returnVehicle();
	}

}
