package com.objectmodelling.level1;

import java.util.ArrayList;

public class SchoolStudent {
    private String name;
    private ArrayList<SchoolCourse> courses;

    public SchoolStudent(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public void enrollCourse(SchoolCourse course) {
        courses.add(course);
        course.addStudent(this); // association link
    }

    public void viewCourses() {
        System.out.println("Courses of " + name + ":");
        for (SchoolCourse c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}
