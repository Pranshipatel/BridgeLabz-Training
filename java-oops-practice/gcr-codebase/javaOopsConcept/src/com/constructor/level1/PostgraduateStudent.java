// subclass to extend Student details
package com.constructor.level1;

class PostgraduateStudent extends Student {
	String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void displayPGStudent() {
        System.out.println("Roll Number     : " + rollNumber); // public
        System.out.println("Name            : " + name);       // protected 
        System.out.println("Specialization  : " + specialization);
        System.out.println("CGPA            : " + getCGPA());  // private 
    }
    
}
