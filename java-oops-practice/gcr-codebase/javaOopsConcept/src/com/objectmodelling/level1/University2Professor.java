package com.objectmodelling.level1;

import java.util.ArrayList;

public class University2Professor {
    private String professorName;
    private ArrayList<University2Course> courses;

    public University2Professor(String professorName) {
        this.professorName = professorName;
        courses = new ArrayList<>();
    }

    // Communication
    public void assignProfessor(University2Course course) {
        courses.add(course);
        course.assignProfessor(this);
        System.out.println(professorName + " assigned to " + course.getCourseName());
    }

    public String getProfessorName() {
        return professorName;
    }
}
