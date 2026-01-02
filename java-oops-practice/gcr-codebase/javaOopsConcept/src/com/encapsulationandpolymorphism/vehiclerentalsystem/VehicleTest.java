package com.encapsulationandpolymorphism.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleTest {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "CAR12345"));
        vehicles.add(new Bike("BIKE202", 500, "BIKE67890"));
        vehicles.add(new Truck("TRK303", 3000, "TRK99999"));

        int days = 3;

        for (Vehicle v : vehicles) {
            System.out.println("---------------------------------");
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Rental Cost: ₹" + v.calculateRentalCost(days));
            System.out.println("Insurance Cost: ₹" + v.calculateInsurance());
            System.out.println(v.getInsuranceDetails());
        }
    }
}
