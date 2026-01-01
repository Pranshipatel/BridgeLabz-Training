package com.objectmodelling.level1;

public class CompanyMain {
	 public static void main(String[] args) {

	        Company company = new Company("TechNova");

	        company.addDepartment("IT");
	        company.addDepartment("HR");

	        company.addEmployeeToDepartment(0, 101, "Pranshi");
	        company.addEmployeeToDepartment(0, 102, "Will");
	        company.addEmployeeToDepartment(1, 201, "Max");

	        company.displayCompany();

	        System.out.println("\n--- Closing Company ---");
	        company.closeCompany();
	    }

}
