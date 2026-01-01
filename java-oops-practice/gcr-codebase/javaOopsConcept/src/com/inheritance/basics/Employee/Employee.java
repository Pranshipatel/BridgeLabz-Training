package com.inheritance.basics.Employee;

public class Employee {
	String name;
	int id;
	int salary;
	
	public Employee(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	void displayDetails() {
		System.out.println("Name = " + name);
		System.out.println("Id = " + id);
		System.out.println("Salary = " + salary);
	}

}
