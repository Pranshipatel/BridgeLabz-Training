package com.encapsulationandpolymorphism.employeemanagement;

class FullTimeEmployee  extends Employee {
	
	public FullTimeEmployee(int employeeId, String name, int baseSalary, String department) {
		super(employeeId, name, baseSalary, department);
	}
	
	int calculateSalary() {
		return getBaseSalary();
	}
	

}
