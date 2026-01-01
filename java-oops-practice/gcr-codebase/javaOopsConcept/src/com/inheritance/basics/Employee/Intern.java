package com.inheritance.basics.Employee;

class Intern extends Employee {
	
	public Intern(String name, int id, int salary) {
		super(name, id, salary);
		
	}
	
	@Override
	void displayDetails() {
		System.out.println("Name = " + name);
		System.out.println("Id = " + id);
		System.out.println("Salary = " + salary);
		
	}

}
