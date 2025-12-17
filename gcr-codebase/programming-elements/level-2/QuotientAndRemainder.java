// Program to take 2 numbers and find their quotient and reminder

import java.util.Scanner;
public class QuotientAndRemainder{
	public static void main(String[] args){
		int number1;
		int number2;
		
		// Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take number1 and number2
		System.out.println("Enter the number one : ");
		number1 = input.nextInt();
		System.out.println("Enter the number two : ");
		number2 = input.nextInt();
		
		// Calculate the Quotient And Remainder
		int quotient = number1 / number2;
		int reminder = number1 % number2;
		
		// Print the Quotient and Remainder
		System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two number " 
		                   + number1 + " and " + number2);
	    
		input.close();
	}
}
