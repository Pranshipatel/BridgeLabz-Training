package com.objectmodelling.level1;

import java.util.ArrayList;

public class University2Student {
    private String studentName;
    private ArrayList<University2Course> courses;

    public University2Student(String studentName) {
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    // Communication
    public void enrollCourse(University2Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(studentName + " enrolled in " + course.getCourseName());
    }

    public String getStudentName() {
        return studentName;
    }
}
