package vehiclerentalapplication;

public class VehicleRentalTest {
	public static void main(String args[]) {
		Customer c1 = new Customer("Pranshi");
		
		Vehicle bike = new Bike(1569, 100);
		Vehicle car = new Car(2000, 500);
		Vehicle truck = new Truck(4999, 1000);
		
		c1.rentVehicle(car,5);
		
	}

}
