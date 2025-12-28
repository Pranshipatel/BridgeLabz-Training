package com.constructor.level1;

class Manager extends Employee {

    String role;

    Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID); // public → accessible
        System.out.println("Department  : " + department);  // protected → accessible
        System.out.println("Role        : " + role);
        System.out.println("Salary      : ₹" + getSalary()); // private → via getter
    }
}
