//  Program to check for the natural number and write the sum of n natural numbers 

import java.util.Scanner;
public class NaturalNumbers{
	public static void main(String[] args){
		int number;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Take number as user input
		System.out.println("Enter number :");
		number = input.nextInt();
		
		// Check whether number is positive integer or not
		if(number > 0){
			// Calculate the sum of n numbers
			int sum = number * (number + 1 ) / 2;
			
			System.out.println("The sum of " + number + " natural numbers is " + sum);
		
		} else {
			System.out.println("The number " + number + " is not natural number");
		}
		
		input.close();
	}
}
			