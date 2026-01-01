package com.objectmodelling.level1;

public class UniversityDepartment {
    private String departmentName;

    UniversityDepartment(String departmentName) { // not public
        this.departmentName = departmentName;
    }

    void displayDepartment() {
        System.out.println("Department: " + departmentName);
    }
}
