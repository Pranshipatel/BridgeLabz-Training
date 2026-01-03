package vehiclerentalapplication;

class Truck extends Vehicle {
	public Truck(int vehicleNumber, double baseRate) {
		super(vehicleNumber, baseRate);	
	}
	
	public double calculateRent(int days) {
		double subCharges = 1000;
		return days * baseRate ;
	}

}
