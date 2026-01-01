package com.inheritance.basics.Employee;

class Manager extends Employee {
	private int teamSize;
	
	public Manager(String name, int id, int salary,int teamSize) {
		super(name, id, salary);
		this.teamSize = teamSize;
	}
	
	@Override
	void displayDetails() {
		System.out.println("Name = " + name);
		System.out.println("Id = " + id);
		System.out.println("Salary = " + salary);
		System.out.println("Team Size = "+ teamSize);
	}

}
