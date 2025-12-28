package com.constructor.level1;

public class Course {
	// Attributes
	String courseName;
	int duration;
	int fee;
	static String instituteName = "BridgeLabz";
	
	Course(String courseName, int duration, int fee){
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	void displayCourseDetails() {
		System.out.println("Course Name = " + courseName );
		System.out.println("Duration = " + duration + " months");
		System.out.println("Fee = " + fee);
		System.out.println("Institute Name = " + instituteName);
		System.out.println("----------------------------------------");
	}
	
	static void updateInstituteName(String newInstituteName) {
		instituteName = newInstituteName;
	}
	
	
	public static void main(String[] args) {
		Course c1 = new Course("Java", 4, 25000);
		Course c2 = new Course("Python", 5, 30000);
		
		c1.displayCourseDetails();
		c2.displayCourseDetails();
		
		// Update institute Name
		Course.updateInstituteName("New Institute");
		
		c1.displayCourseDetails();
		c2.displayCourseDetails();
		
	}

}
