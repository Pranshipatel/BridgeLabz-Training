// Program to check if the first, second, or third number is the largest of the three.

import java.util.Scanner;
public class LargestNumber{
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
		
		// Print which number is largest
		System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
		System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
		System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));
		
		input.close();
	
	}
}

