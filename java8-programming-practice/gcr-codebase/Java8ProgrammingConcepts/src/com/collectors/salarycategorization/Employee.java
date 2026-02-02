package com.collectors.salarycategorization;

public class Employee {
	private String name;
	private String Department;
	private double salary;
	
	

	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		Department = department;
		this.salary = salary;
	}
	
	public String getDepartment() {
		return Department;
	}

	public double getSalary() {
		return salary;
	}

}
