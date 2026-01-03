package vehiclerentalapplication;

public class Vehicle {
	protected int vehicleNumber;
	protected double baseRate;
	
	// Constructor
	public Vehicle(int vehicleNumber, double baseRate) {
		this.vehicleNumber = vehicleNumber;
		this.baseRate = baseRate;
	}
	
	// Getter and Setter
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	
	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	public double getBaseRate() {
		return baseRate;
	}
	
	

}
