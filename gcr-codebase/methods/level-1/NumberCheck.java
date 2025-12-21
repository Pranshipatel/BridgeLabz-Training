// Program to check whether a number is positive, negative, or zero.

import java.util.Scanner;

public class NumberCheck{
	
	// Check whether a number is positive, negative, or zero
	public int check( int number ){
		
		if ( number >= 1 ){
			return 1;
		} else if (number == 0 ){
			return 0;
		} else {
			return -1;
		}
		
	}
	
	public static void main (String[] args){
		
		NumberCheck numberCheck = new NumberCheck();
		
		// Create Scanner object
        Scanner input = new Scanner(System.in);
		
		 // Take number of persons
        System.out.println("Enter number of Student:");
        int numberOfStudents = input.nextInt();
		
		// Get whether the number is positive, negative, or zero
		int result = numberCheck.check(numberOfStudents);
		
		// Print whether a number is positive, negative, or zero
		// 1 for positive, 0 for zero, -1 for negative
		System.out.println("Result = " + result);
		
		input.close();
		
	}
}
		
		
		