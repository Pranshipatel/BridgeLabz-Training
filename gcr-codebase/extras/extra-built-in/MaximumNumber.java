// Program that takes three integer inputs from the user and finds the maximum of the three numbers.

import java.util.Scanner;
public class MaximumNumber{
	
	public static int getMaximumNumber(int firstNumber, int secondNumber, int thirdNumber){
		if(firstNumber > secondNumber && firstNumber > thirdNumber) return firstNumber;
		else if (secondNumber > thirdNumber && secondNumber > firstNumber) return secondNumber;
		else return thirdNumber;
	}
	
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take Three Numbers as user input
		System.out.println("Enter first Number: ");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter second Number: ");
		int secondNumber = input.nextInt();
		
		System.out.println("Enter third Number: ");
		int thirdNumber = input.nextInt();
		
		int max = getMaximumNumber(firstNumber, secondNumber, thirdNumber);
		
		// Print maximum number
		System.out.println("The maximum number is = " + max);
		
	    input.close();
	}
}
		
		
