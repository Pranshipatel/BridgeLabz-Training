// Program to take 2 numbers and print their quotient and reminder

import java.util.Scanner;
import java.util.Arrays;

public class RemainderAndQuotient{
	
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		
		int quotientAndRemainder[] = new int[2];
		
		// calculate quotient and reminder
		quotientAndRemainder[0] = number / divisor; // quotient
		quotientAndRemainder[1] = number % divisor;  // reminder
		
		return quotientAndRemainder;
		
	}

	
	public static void main(String[] args){
		
		RemainderAndQuotient reminderAndQuotient = new RemainderAndQuotient();
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Take number as input
		System.out.println("Enter the number 1 : ");
		int number = input.nextInt();
		
		// Take divisor as input
		System.out.println("Enter the divisor: ");
		int divisor = input.nextInt();
		
		// Get the result
		int result[] = RemainderAndQuotient.findRemainderAndQuotient(number, divisor);
		
		
		// Print quotient and reminder
		// result[0] = quotient, result[1] = reminder
        System.out.println("quotient and reminder is " + Arrays.toString(result));
		
		input.close();
		
	}
}