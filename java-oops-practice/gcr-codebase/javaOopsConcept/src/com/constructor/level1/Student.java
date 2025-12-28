// Create a student class to display student details

package com.constructor.level1;

public class Student {
	
	// public variable
	public int rollNumber;
	
	// protected variable
	protected String name;
	
	// private variable
	private double cgpa;
	
	Student(int rollNumber, String name, double cgpa){
		this.rollNumber = rollNumber;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	void displayStudentDetails() {
		System.out.println("Roll Number :" + rollNumber);
		System.out.println("Name        : " + name);
		System.out.println("CGPA        : " + cgpa);
		System.out.println("-----------------------");
	}
	
	// public getter for cgpa
	public double getCGPA() {
		return cgpa;
	}
	
	public void setCGPA(double cgpa) {
		if(cgpa >= 0 && cgpa <= 10) {
			this.cgpa = cgpa;
		} else {
			System.out.println("Cgpa is invalid");
		}
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "Pranshi", 8.2);
		
		// print Student details
		s1.displayStudentDetails();
		
		PostgraduateStudent pg = new PostgraduateStudent(101, "Pranshi", 8.7, "Computer Science");

        pg.displayPGStudent();

        // modifying CGPA using public method
        pg.setCGPA(9.2);

        System.out.println("\nAfter CGPA Update:");
        pg.displayPGStudent();
		
	}
	
	
	
	
	
	

}
