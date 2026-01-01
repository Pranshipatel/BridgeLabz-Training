package com.objectmodelling.level1;

public class University2Main {
	public static void main(String[] args) {

        University2 university = new University2("Global University 2");

        University2Student s1 = new University2Student("Pranshi");
        University2Student s2 = new University2Student("Amit");

        University2Professor p1 = new University2Professor("Dr. Sharma");

        University2Course c1 = new University2Course("Java");
        University2Course c2 = new University2Course("Python");

        university.addStudent(s1);
        university.addStudent(s2);
        university.addProfessor(p1);
        university.addCourse(c1);
        university.addCourse(c2);

        p1.assignProfessor(c1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        System.out.println();
        c1.showCourseDetails();
    }

}
