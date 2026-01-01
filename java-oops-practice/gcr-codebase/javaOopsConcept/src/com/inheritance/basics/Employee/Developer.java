package com.inheritance.basics.Employee;

class Developer extends Employee{
	
	private String programmingLanguage;
	
	public Developer(String name, int id, int salary, String programmingLanguage) {
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	@Override
	void displayDetails() {
		System.out.println("Name = " + name);
		System.out.println("Id = " + id);
		System.out.println("Salary = " + salary);
		System.out.println("Programming Language = "+ programmingLanguage);
	}

}
