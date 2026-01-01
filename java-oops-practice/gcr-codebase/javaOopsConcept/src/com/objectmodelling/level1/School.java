package com.objectmodelling.level1;

import java.util.ArrayList;

public class School {
	
    private String schoolName;
    private ArrayList<SchoolStudent> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    public void addStudent(SchoolStudent student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("School: " + schoolName);
        for (SchoolStudent s : students) {
            System.out.println("- " + s.getName());
        }
    }
    
    public static void main(String[] args) {

        School school = new School("Green Valley School");

        SchoolStudent s1 = new SchoolStudent("Pranshi");
        SchoolStudent s2 = new SchoolStudent("Will");

        SchoolCourse c1 = new SchoolCourse("Java");
        SchoolCourse c2 = new SchoolCourse("Python");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        s1.viewCourses();
        System.out.println();
        c1.viewStudents();
    }
    
}
