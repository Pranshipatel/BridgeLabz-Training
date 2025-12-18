//  Program to find the sum of n natural numbers using for loop 

import java.util.Scanner;
public class SumOfNaturalNumber2{
	public static void main (String[] args){
		int number;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// Check whether number is positive integer or not
		if(number > 0){
			// Calculate the sum of n numbers
			int sum = number * (number + 1 ) / 2;
			
			int loopSum = 0;
			// Calculate the sum using while loop
		    for( ; number > 0 ; number-- ){
			loopSum = loopSum + number;
			}
			
			System.out.println("Comparison of two number is " + ( sum == loopSum ? "True" : "False"));
		
		} else {
			System.out.println("The number " + number + " is not natural number");
		}
		
		input.close();
		
	}
}