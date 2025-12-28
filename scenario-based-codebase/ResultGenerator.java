// Program to generate the average of marks and print grade

import java.util.Scanner;
public class ResultGenerator {
	
	//Method to calculate the marks average
	public static int computeAverage(int[] marks) {
		
		int average;
		int sum =0;
		int noOfSubjects = marks.length;
		for(int i=0; i < marks.length; i++) {
			sum += marks[i];
		}
		average = sum / noOfSubjects;
		
		return average;
	}

	public static void main(String[] args) {
		//Initializing subjects name
		String[] subjects = {"English","Hindi","Math's","Science","S.st"};
		
		//Creating scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		int[] marks= new int[5];
		for(int i =0; i<marks.length;i++) {
			System.out.println("Enter the marks of " + subjects[i]);
			marks[i] = input.nextInt();
		}
		
		//Calling method to compute the average of the marks
		 int average = ResultGenerator.computeAverage(marks);
		
		//Computing grade of the student
		String grade = new String();
		if(average>90) {
			grade ="A"; 
		}
		else if(average>80) {
			grade ="B"; 
		}
		else if(average>75) {
			grade ="C"; 
		}
		else if(average>60) {
			grade ="D"; 
		}
		else if(average>40) {
			grade ="E"; 
		}
		else {
			grade = "Fail";
		}
		
		//Displaying result
		System.out.println("The student score grade " + grade + " for average score " + average);
		
		input.close();		
		

	}

}