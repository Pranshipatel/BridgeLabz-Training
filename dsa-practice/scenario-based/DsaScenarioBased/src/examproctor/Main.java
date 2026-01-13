package examproctor;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();
        Scanner sc = new Scanner(System.in);

        // Add questions
        exam.addQuestion(
            new Questions(1, "What is Java?",
                "A. Language", "B. OS", "C. Browser", "D. Device"),
            "A"
        );

        exam.addQuestion(
            new Questions(2, "Which is not OOP concept?",
                "A. Inheritance", "B. Polymorphism",
                "C. Compilation", "D. Encapsulation"),
            "C"
        );

        exam.addQuestion(
            new Questions(3, "Which collection uses LIFO?",
                "A. Queue", "B. Stack", "C. List", "D. Map"),
            "B"
        );

        // Start exam
        exam.displayQuestion();

        while (true) {
            System.out.println("\nChoose action:");
            System.out.println("1. Next");
            System.out.println("2. Back");
            System.out.println("3. Submit");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    exam.next();
                    break;

                case 2:
                    exam.backward();
                    break;

                case 3:
                    exam.calculateScore();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
