package com.objectmodelling.level1;

import java.util.ArrayList;
import java.util.List;

public class CompanyDepartment {
    private String deptName;
    private List<CompanyEmployee> employees;

    CompanyDepartment(String deptName) {   // created only by Company
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmployee(int empId, String empName) {
        employees.add(new CompanyEmployee(empId, empName));
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (CompanyEmployee emp : employees) {
            emp.displayEmployee();
        }
    }
}
