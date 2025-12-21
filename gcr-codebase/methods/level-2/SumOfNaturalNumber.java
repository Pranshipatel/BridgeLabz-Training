// Program to find the sum of n natural numbers

import java.util.Scanner;
public class SumOfNaturalNumber{
	
	// method to calculate the sum of natural number using recursion
	public static int calculateSum( int number ){
		
		if ( number <= 0 ) return 0;
		
		return number + calculateSum(number - 1);
		
	}
	
	// method to calculate the sum of natural number using fomulae
	public static int fomulae( int number ){
		
		return number * (number + 1) / 2;
		
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
		int recursion = sumOfNaturalNumber.calculateSum(number);
		int formulaeResult = sumOfNaturalNumber.fomulae(number);
		
		// Print the comparison
		System.out.println("Comparison of two result is : " + (recursion == formulaeResult ? "true " : "false"));
			
		input.close();
		
	}
}