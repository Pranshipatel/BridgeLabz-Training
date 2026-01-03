package vehiclerentalapplication;

public class Customer {
	String name ;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void rentVehicle(Vehicle vehicle, int days) {
        System.out.println(name + " booked vehicle " + vehicle.getVehicleNumber());
       
    }

}
