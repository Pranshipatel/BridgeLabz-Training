package com.objectmodelling.level1;

import java.util.ArrayList;

public class University2 {
    private String universityName;
    private ArrayList<University2Student> students;
    private ArrayList<University2Professor> professors;
    private ArrayList<University2Course> courses;

    public University2(String universityName) {
        this.universityName = universityName;
        students = new ArrayList<>();
        professors = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(University2Student student) {
        students.add(student);
    }

    public void addProfessor(University2Professor professor) {
        professors.add(professor);
    }

    public void addCourse(University2Course course) {
        courses.add(course);
    }
}
