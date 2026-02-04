package com.functioninterface.smartdevice;

public class Main {
	public static void main(String[] args) {
		TurnOn lightOn = ()->{
			System.out.println("Switch On the lights");
		};
		
		TurnOff lightOff = () -> {
			System.out.println("Switch Off the lights");
		};
		
		TurnOn acOn = () ->{
			System.out.println("Switch On the Ac");
		};
		
		TurnOff acOff = () -> {
			System.out.println("Switch Off the Ac");
		};
		
		TurnOn tvOn = () ->{
			System.out.println("Switch On the tv");
		};
		
		TurnOff tvOff = () -> {
			System.out.println("Switch Off the tv");
		};
		
		
		lightOn.turnOn();
		acOn.turnOn();
		acOff.turnOff();
	}
	
	

}
