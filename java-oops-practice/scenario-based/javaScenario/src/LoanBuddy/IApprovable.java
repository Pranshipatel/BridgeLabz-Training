package LoanBuddy;

public interface IApprovable {
	boolean approveLoan(Application applicant);
	double calculateEMI();

}
