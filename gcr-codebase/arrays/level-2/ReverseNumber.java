// Program to take a number as input and reverse the number

import java.util.Scanner;
import java.util.Arrays;
public class ReverseNumber{
	public static void main (String[] args){
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		// store the value of number
		int originalNumber = number;
		
		// Calculate the count of number
		int count = 0;
		while ( number != 0 ){
			int remainder = number % 10;
			number = number / 10;
			count++ ;
		}
		
		// Creating array to store the reverse digits
		int reverseArray[] = new int[count];
		
		// Storing the values in an array
		int index = 0;
		while ( originalNumber != 0 ){
			int remainder = originalNumber % 10;
			reverseArray[index] = remainder;
			originalNumber = originalNumber / 10;
			index++ ;
		}
		
		// Print the array
		System.out.println("Array in reverse order = " + Arrays.toString(reverseArray));
		
		input.close();
	
	}
}