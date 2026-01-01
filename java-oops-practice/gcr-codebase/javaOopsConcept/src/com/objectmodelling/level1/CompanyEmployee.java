package com.objectmodelling.level1;

public class CompanyEmployee {
    private int empId;
    private String empName;

    CompanyEmployee(int empId, String empName) {   // not public
        this.empId = empId;
        this.empName = empName;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId + ", Name: " + empName);
    }
}
