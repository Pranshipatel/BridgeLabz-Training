package fleetmanager;

public class Vehicle {
	 String vehicleId;
	    int mileage;

	    Vehicle(String vehicleId, int mileage) {
	        this.vehicleId = vehicleId;
	        this.mileage = mileage;
	    }

	    void display() {
	        System.out.println(vehicleId + " - Mileage: " + mileage);
	    }

}
