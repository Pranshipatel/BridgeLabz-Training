package universityenrollmentsystem;

public class Faculty implements Graded {

    @Override
    public void assignGrade(Student student, double marks) {
        double gradePoint;

        if (marks >= 90) gradePoint = 10;
        else if (marks >= 75) gradePoint = 8;
        else if (marks >= 60) gradePoint = 6;
        else gradePoint = 4;

        student.updateGPA(gradePoint);
        System.out.println("Letter grade assigned");
    }
}
