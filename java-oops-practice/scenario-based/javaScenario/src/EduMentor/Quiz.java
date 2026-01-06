package EduMentor;

class Quiz {

    private String[] questions;        // internal question bank (PRIVATE)
    private final String[] answers;    // cannot be modified once set
    private int score;

    public Quiz(String[] questions, String[] answers, String difficulty) {
        this.questions = questions;
        this.answers = answers;

        if(difficulty.equalsIgnoreCase("hard")) {
            System.out.println("Hard Quiz Created");
        } else {
            System.out.println("Easy Quiz Created");
        }
    }

    public void submitQuiz(String[] userAnswers) {
        for(int i = 0; i < answers.length; i++) {
            if(answers[i].equals(userAnswers[i])) {
                score++; // operator usage
            }
        }
    }

    public double calculatePercentage() {
        return (score * 100.0) / answers.length;
    }
}
