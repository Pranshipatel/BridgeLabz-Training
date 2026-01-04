package universityenrollmentsystem;

public class Enrollment {

    public void enroll(Student student, Course course) {
        student.courses.add(course);
        System.out.println(student.name + " enrolled in " + course.getCourseName());
    }
}
