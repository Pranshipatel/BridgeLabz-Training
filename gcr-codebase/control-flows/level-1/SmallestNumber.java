// Program to check if the first is the smallest of the 3 numbers

import java.util.Scanner;
public class SmallestNumber{
	public static void main(String[] args){
		int number1;
		int number2;
		int number3;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Take number1, number2 and number3 as user input
		System.out.println("Enter number 1:");
		number1 = input.nextInt();
		System.out.println("Enter number 2:");
		number2 = input.nextInt();
		System.out.println("Enter number 3:");
		number3 = input.nextInt();
		
		// Print whether the first number is smallest or not
		System.out.println("Is the first number the smallest ?" + (number1 < number2 && number1 < number3));
		
		input.close();
	}
}
		
