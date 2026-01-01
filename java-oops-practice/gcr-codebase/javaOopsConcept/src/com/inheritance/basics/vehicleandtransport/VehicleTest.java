package com.inheritance.basics.vehicleandtransport;

public class VehicleTest {
	public static void main(String[] args) {
		Car c1 = new Car(120, "diesel" , 6);
		Truck t1 = new Truck(220, "diesel");
		Motorcycle m1 = new Motorcycle(111, "petrol");
		
		
		System.out.println("--------Car Details---------");
		c1.displayInfo();
		
		System.out.println("--------Truck Details---------");
		t1.displayInfo();

		
		System.out.println("--------Motorcycle Details---------");
		m1.displayInfo();

	}

}
