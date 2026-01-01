package com.inheritance.singleinheritance.smartdevices;

public class DeviceTest {
	public static void main(String[] args) {
		Thermostat t1 = new Thermostat(2,"working", 45);
		
		System.out.println("----------Device Details---------");
		t1.displayStatus();
	}

}
