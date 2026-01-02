package com.encapsulationandpolymorphism.employeemanagement;

class PartTimeEmployee extends Employee {
	private int totalHours;
	private int fixedSalary;
	public PartTimeEmployee(int employeeId, String name, int baseSalary, String department, int totalHours, int fixedSalary) {
		super(employeeId, name, baseSalary, department);
		this.totalHours = totalHours;
		this.fixedSalary = fixedSalary;
	}
	
	int calculateSalary() {
		return totalHours * fixedSalary;
	}

}
