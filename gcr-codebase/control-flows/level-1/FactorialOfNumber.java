//  Program to find the factorial of an integer entered by the user

import java.util.Scanner;
public class FactorialOfNumber{
	public static void main (String[] args){
		int number;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// create variable name fact and assign 1 to it
		int factorial = 1;
		
		// Calculate the factorial using while loop
		while ( number >= 1 ){
			factorial = factorial * number;
			number-- ;
			
		}
		
		// Printe the factorial of number
		System.out.println("The factorial of number is " + factorial);
		
		input.close();
		
	}
}
		