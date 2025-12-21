// program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18

import java.util.Scanner;
public class StudentVoteChecker{
	
	// check student can vote or not
	 public boolean canStudentVote(int age){
		 
		 // check for negative age
		if (age < 0 ) return false;
		 
		
		if( age >= 18 ){
			return true;
		} else {
			return false;
		}
		
	 }
	
	public static void main(String[] args){
		int age;
		
		StudentVoteChecker vote = new StudentVoteChecker();
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take age as input
		System.out.println("Enter the age : ");
		age = input.nextInt();
		
		boolean result = vote.canStudentVote(age);
		
		// Print the eligibilty of student
		System.out.println("Student can vote = " + result );
		
		input.close();
		
	}
	
}