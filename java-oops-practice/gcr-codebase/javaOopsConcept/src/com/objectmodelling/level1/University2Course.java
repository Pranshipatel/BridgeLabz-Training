package com.objectmodelling.level1;

import java.util.ArrayList;

public class University2Course {
    private String courseName;
    private University2Professor professor;
    private ArrayList<University2Student> students;

    public University2Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public void addStudent(University2Student student) {
        students.add(student);
    }

    public void assignProfessor(University2Professor professor) {
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " +
                (professor != null ? professor.getProfessorName() : "Not Assigned"));
        System.out.println("Students:");
        for (University2Student s : students) {
            System.out.println("- " + s.getStudentName());
        }
    }
}
