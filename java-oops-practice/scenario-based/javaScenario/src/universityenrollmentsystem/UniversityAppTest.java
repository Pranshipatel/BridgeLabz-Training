package universityenrollmentsystem;

public class UniversityAppTest {
    public static void main(String[] args) {

        Student s1 = new Undergraduate("Pranshi", 101);
        Student s2 = new Postgraduate("Amit", 201);

        Course c1 = new Course("CS101", "Data Structures", 4);
        Course c2 = new Course("AI501", "Machine Learning", 5);

        Enrollment e = new Enrollment();
        System.out.println("-------------------------");
        e.enroll(s1, c1);
        e.enroll(s2, c2);
        
        System.out.println("-------------------------");

        Graded letterFaculty = new Faculty();
        Graded passFailFaculty = new PassFailFaculty();

        
        letterFaculty.assignGrade(s1, 85);
        passFailFaculty.assignGrade(s2, 45);
        
        System.out.println("-------------------------");

        s1.showTranscript();
        s2.showTranscript();
    }
}
