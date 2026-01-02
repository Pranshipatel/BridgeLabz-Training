package com.encapsulationandpolymorphism.employeemanagement;

public abstract class Employee {
	private int employeeId;
	private String name;
	private int baseSalary;
	private String department;
	
	// Create Getter and setter
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	// abstract method
	abstract int calculateSalary();
	
	// Constructor
	public Employee(int employeeId, String name, int baseSalary, String department) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	// Display details
	void displayDetails() {
		System.out.println("Employee Id = " + employeeId);
		System.out.println("Employee Name = " + name);
		System.out.println("Base Salary = " + baseSalary);
	}

}
