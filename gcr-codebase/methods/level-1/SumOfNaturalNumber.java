// Program to find the sum of n natural numbers

import java.util.Scanner;
public class SumOfNaturalNumber{
	
	public int calculateSum( int number ){
		
		int loopSum = 0;
		// Calculate the sum using while loop
		while ( number > 0 ){
			loopSum = loopSum + number;
			number--;
		}	
				
		return loopSum;
	}
	
	
	
	public static void main (String[] args){
		int number;
		
		SumOfNaturalNumber sumOfNaturalNumber = new SumOfNaturalNumber();
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// Get the result 
		int result = sumOfNaturalNumber.calculateSum(number);
		
		// Print the sum
		System.out.println("Sum = " + result);
			
		input.close();
		
	}
}