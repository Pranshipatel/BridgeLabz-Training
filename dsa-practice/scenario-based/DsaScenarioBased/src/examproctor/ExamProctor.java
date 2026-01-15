package examproctor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ExamProctor {

    Scanner input = new Scanner(System.in);

    Stack<Questions> queStack = new Stack<>();
    Stack<Questions> visitedStack = new Stack<>();

    HashMap<Integer, String> questionMap = new HashMap<>(); // correct answers
    HashMap<Integer, String> answerMap = new HashMap<>();   // user answers

    int score = 0;

    // Add question + correct answer
    void addQuestion(Questions q, String correctAnswer) {
        queStack.push(q);
        questionMap.put(q.questionId, correctAnswer);
    }

    // Display current question
    void displayQuestion() {
        if (queStack.isEmpty()) {
            System.out.println("No question to display.");
            return;
        }

        Questions q = queStack.peek();

        System.out.println("\n--------------------------------------------");
        System.out.println(q.question);
        System.out.println(q.option1);
        System.out.println(q.option2);
        System.out.println(q.option3);
        System.out.println(q.option4);
        System.out.println("--------------------------------------------");

        System.out.print("Enter your answer: ");
        String ans = input.nextLine();
        answerMap.put(q.questionId, ans);
    }

    // Move to next question
    void next() {
        if (queStack.size() == 1) {
            System.out.println("This is the last question.");
            displayQuestion();
            return;
        } else {
            visitedStack.push(queStack.pop());
           displayQuestion();
        }
    }

    // Move backward
    void backward() {
        if (visitedStack.isEmpty()) {
            System.out.println("No previous question.");
            displayQuestion();
            return;
        } else {
            queStack.push(visitedStack.pop());
            displayQuestion();
        }
    }

    // Score calculation
    void calculateScore() {
        score = 0;

        for (Map.Entry<Integer, String> entry : questionMap.entrySet()) {
            int qId = entry.getKey();
            String correct = entry.getValue();
            String userAns = answerMap.get(qId);

            if (userAns != null && userAns.equalsIgnoreCase(correct)) {
                score++;
            }
        }

        System.out.println("\n✅ Exam Submitted");
        System.out.println("Final Score: " + score + " / " + questionMap.size());
    }
}
