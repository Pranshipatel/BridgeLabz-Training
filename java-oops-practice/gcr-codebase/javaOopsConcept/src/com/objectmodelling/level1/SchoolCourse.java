package com.objectmodelling.level1;

import java.util.ArrayList;

public class SchoolCourse {
    private String courseName;
    private ArrayList<SchoolStudent> students;

    public SchoolCourse(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public void addStudent(SchoolStudent student) {
        students.add(student);
    }

    public void viewStudents() {
        System.out.println("Students in " + courseName + ":");
        for (SchoolStudent s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
