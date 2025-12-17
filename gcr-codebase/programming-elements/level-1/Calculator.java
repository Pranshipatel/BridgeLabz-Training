// Program to create a basic calculator that can perform addition, subtraction, multiplication, and division

import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		
		// Create Scanner Object to take user input from Standard Input
		Scanner input = new Scanner(System.in);
		// Create a variable number1 and number 2 and take user inputs
		System.out.println("Enter number 1:");
		int number1 = input.nextInt();
		System.out.println("Enter number 2:");
		int number2 = input.nextInt();
		
		// Caculate the addition, subtraction, multiplication and division of number1 and number2
		int addition = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;
		
		// Print the value ddition, subtraction, multiplication and division of two numbers
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
		                    + number1 + " and " + number2 + " is " + addition + " , " + subtraction + 
							" , " + multiplication + " and " + division);

	}
}