package com.objectmodelling.level1;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
    private String companyName;
    private List<CompanyDepartment> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new CompanyDepartment(deptName));
    }

    public void addEmployeeToDepartment(int deptIndex, int empId, String empName) {
        departments.get(deptIndex).addEmployee(empId, empName);
    }

    public void displayCompany() {
        System.out.println("Company: " + companyName);
        for (CompanyDepartment dept : departments) {
            dept.displayDepartment();
        }
    }

   
    public void closeCompany() {
        departments.clear(); // Departments & Employees destroyed
        System.out.println("Company closed. All departments and employees removed.");
    }
    
   
}
