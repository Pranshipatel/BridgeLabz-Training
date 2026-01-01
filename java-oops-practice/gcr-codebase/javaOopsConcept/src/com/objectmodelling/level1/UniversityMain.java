package com.objectmodelling.level1;

public class UniversityMain {
	 public static void main(String[] args) {

	        // Faculty exists independently
	        UniversityFaculty f1 = new UniversityFaculty("Dr. Sharma");
	        UniversityFaculty f2 = new UniversityFaculty("Dr. Mehta");

	        University uni = new University("Global University");

	        uni.addDepartment("Computer Science");
	        uni.addDepartment("Mechanical");

	        uni.addFaculty(f1);
	        uni.addFaculty(f2);

	        uni.displayUniversity();

	        System.out.println("\n--- Closing University ---");
	        uni.closeUniversity();

	        System.out.println("\nFaculty still exists:");
	        f1.displayFaculty();
	        f2.displayFaculty();
	    }

}
