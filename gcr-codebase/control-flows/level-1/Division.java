//  Program to check if a number is divisible by 5

import java.util.Scanner;
public class Division{
	public static void main(String[] args){
		int number;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input 
		System.out.println("Enter the number: ");
		number = input.nextInt();
		
		// Print whether the number is divisible by 5 or not
		System.out.println("Is the number " + number + " divisible by 5 ? " +( number % 5 == 0));
		
		input.close();
	}
}

