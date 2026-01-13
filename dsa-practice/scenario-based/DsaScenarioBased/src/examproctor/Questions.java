package examproctor;

public class Questions {
	int questionId;
	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	
	public Questions(int questionId, String question, String option1, String option2, String option3, String option4) {
		this.questionId = questionId;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
	}

}
