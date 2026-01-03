package vehiclerentalapplication;

class Car  extends Vehicle{
	public Car(int vehicleNumber, double baseRate) {
		super(vehicleNumber, baseRate);	
	}
	
	public double calculateRent(int days) {
		double subCharges = 500;
		return days * baseRate ;
	}

}
