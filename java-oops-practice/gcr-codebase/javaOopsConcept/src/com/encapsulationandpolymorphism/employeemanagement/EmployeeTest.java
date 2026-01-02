package com.encapsulationandpolymorphism.employeemanagement;

public class EmployeeTest {
	public static void main(String[] args) {
		FullTimeEmployee e1 = new FullTimeEmployee(12, "Pranshi", 250000, "IT");
		PartTimeEmployee e2 = new PartTimeEmployee(12, "Pranshi", 250000, "IT" , 12, 500);
		
		e1.displayDetails();
		
		System.out.println();
		
		e2.displayDetails();
	}
	
	

}
