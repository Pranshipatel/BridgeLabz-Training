package com.inheritance.basics.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Developer d1 = new Developer("Vasu", 37, 25000000,"Java");
		Manager m1 = new Manager("Pranshi", 77, 10000000,5);
		Intern i1 = new Intern("Vecna", 01, 250);
		
		System.out.println("------------Developer Details------------");
		d1.displayDetails();
		
		System.out.println("\n------------Manager Details------------");
		m1.displayDetails();
		
		System.out.println("\n------------Intern Details------------");
		i1.displayDetails();
		
	}

}
