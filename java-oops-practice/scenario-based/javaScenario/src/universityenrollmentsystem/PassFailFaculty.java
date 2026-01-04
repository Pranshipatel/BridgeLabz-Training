package universityenrollmentsystem;

public class PassFailFaculty implements Graded {

    @Override
    public void assignGrade(Student student, double marks) {
        if (marks >= 50) {
            student.updateGPA(6);
            System.out.println("Status: PASS");
        } else {
            student.updateGPA(0);
            System.out.println("Status: FAIL");
        }
    }
}
