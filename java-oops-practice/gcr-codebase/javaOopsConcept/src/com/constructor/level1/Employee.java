package com.constructor.level1;

public class Employee {

    // public variable
    public int employeeID;

    // protected variable
    protected String department;

    // private variable
    private double salary;

    // parameterized constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
       
        this.salary = salary;
    }

    // public getter for salary
    public double getSalary() {
        return salary;
    }
    

    // public method to modify salary
    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
        } else {
            System.out.println("Invalid salary amount");
        }
    }
    
    public static void main(String[] args) {

        Manager mgr = new Manager(501, "IT", 75000, "Project Manager");

        mgr.displayManagerDetails();

        // update salary using public method
        mgr.updateSalary(85000);

        System.out.println("\nAfter Salary Update:");
        mgr.displayManagerDetails();
    }
}
