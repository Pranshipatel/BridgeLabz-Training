package com.objectmodelling.level1;

import java.util.ArrayList;

public class University {
    private String universityName;
    private ArrayList<UniversityDepartment> departments;
    private ArrayList<UniversityFaculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    // Composition
    public void addDepartment(String deptName) {
        departments.add(new UniversityDepartment(deptName));
    }

    // Aggregation
    public void addFaculty(UniversityFaculty faculty) {
        faculties.add(faculty);
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (UniversityDepartment d : departments) {
            d.displayDepartment();
        }

        System.out.println("Faculty Members:");
        for (UniversityFaculty f : faculties) {
            f.displayFaculty();
        }
    }

    // Composition effect
    public void closeUniversity() {
        departments.clear(); // departments destroyed
        System.out.println("University closed. All departments removed.");
    }
}
