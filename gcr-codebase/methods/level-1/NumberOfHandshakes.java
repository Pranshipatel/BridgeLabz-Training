// Program to find the maximum number of handshakes among students

import java.util.Scanner;

public class NumberOfHandshakes{
	
	public int numberOfHandshakesCalculation(int numberOfStudents){
		
		// Calculate totalHandshakes
		int totalHandshakes = (numberOfStudents * (numberOfStudents - 1))/2;
		
		// return
		return totalHandshakes;
		
	}
	
	public static void main(String[] args){
		
		NumberOfHandshakes numberOfHandshakes = new NumberOfHandshakes();
		
		// Create Scanner object
        Scanner input = new Scanner(System.in);
		
		 // Take number of persons
        System.out.println("Enter number of Student:");
        int numberOfStudents = input.nextInt();
		
		// Get total handshakes
	    int totalHandshakes = numberOfHandshakes.numberOfHandshakesCalculation(numberOfStudents);
		
		// Print the number of possible handshakes
		System.out.println("Number of possible handshakes = " + totalHandshakes);
		
		input.close();
	
	}
}