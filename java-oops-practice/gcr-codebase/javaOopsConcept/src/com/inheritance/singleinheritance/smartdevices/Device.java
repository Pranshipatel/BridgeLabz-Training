package com.inheritance.singleinheritance.smartdevices;

public class Device {
	int deviceId;
	String status;
	
	public Device(int deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	}
	
	void displayStatus() {
		System.out.println("Device id = " + deviceId);
		System.out.println("Status of Device = " + status);
	}

}
