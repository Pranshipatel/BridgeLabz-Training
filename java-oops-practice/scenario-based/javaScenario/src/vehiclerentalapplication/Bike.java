package vehiclerentalapplication;

class Bike extends Vehicle{
	
	public Bike(int vehicleNumber, double baseRate) {
		super(vehicleNumber, baseRate);	
	}
	
	public double calculateRent(int days) {
		double subCharges = 50;
		return days * baseRate ;
	}


}
