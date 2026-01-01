package com.inheritance.singleinheritance.smartdevices;

class Thermostat extends Device {
	private int temperatureSetting;
	
	public Thermostat(int deviceId, String status, int temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	
	void displayStatus() {
		System.out.println("Device id = " + deviceId);
		System.out.println("Status of Device = " + status);
		System.out.println("Temperature Setting = " + temperatureSetting + " degree Celcius");
	}

}
