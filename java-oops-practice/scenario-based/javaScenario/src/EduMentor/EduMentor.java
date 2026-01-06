package EduMentor;

public class EduMentor {
    public static void main(String[] args) {

        Learner learner = new Learner(
            "Pranshi",
            "pranshi@gmail.com",
            101,
            "full"
        );

        learner.displayRole();
        learner.generateCertificate();

        String[] ques = {
            "What is Java?",
            "What is OOP?"
        };

        String[] correctAns = {
            "Programming Language",
            "Object Oriented Programming"
        };

        Quiz quiz = new Quiz(ques, correctAns, "easy");

        String[] userAns = {
            "Programming Language",
            "Object Oriented Programming"
        };

        quiz.submitQuiz(userAns);

        System.out.println("Quiz Percentage: " + quiz.calculatePercentage() + "%");
        System.out.println("--------------------------------------------------");
    }
}
