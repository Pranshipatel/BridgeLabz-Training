package universityenrollmentsystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
    protected String name;
    protected int id;
    private double gpa; // secured
    protected List<Course> courses = new ArrayList<>();

    // Constructor without electives
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Constructor with electives
    public Student(String name, int id, List<Course> electives) {
        this(name, id);
        this.courses.addAll(electives);
    }

    protected void updateGPA(double gradePoint) {
        gpa = (gpa + gradePoint) / 2; // simple GPA logic
    }

    public void showTranscript() {
        System.out.println("Student: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Courses Enrolled:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
