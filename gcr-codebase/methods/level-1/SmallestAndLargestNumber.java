// Program to find Smallest and Largest Of 3 Numbers

import java.util.Scanner;
import java.util.Arrays;

public class SmallestAndLargestNumber{
	
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int array[] = new int[2];
		
		// Find Smallest number
		if (number1 < number2 && number1 < number3){
			array[0] = number1;
		} else if (number2 < number1 && number2 < number3){
			array[0] = number2;
		} else {
			array[0] = number3;
		}
		
		// Find Largest Number
		if (number1 > number2 && number1 > number3){
			array[1] = number1;
		} else if (number2 > number1 && number2 > number3){
			array[1] = number2;
		} else {
			array[1] = number3;
		}
		
		return array;
	}
	
	public static void main (String[] args){
		
		SmallestAndLargestNumber smallestAndLargest = new SmallestAndLargestNumber();
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Take number as input
		System.out.println("Enter the number 1 : ");
		int number1 = input.nextInt();
		// Take number as input
		System.out.println("Enter the number 2: ");
		int number2 = input.nextInt();
		// Take number as input
		System.out.println("Enter the number 2 : ");
		int number3 = input.nextInt();
		
		// Get the result
		int number[] = smallestAndLargest.findSmallestAndLargest(number1, number2, number3);
		
		// Print Smallest and Largest Number
		System.out.println("Smallest and Largest Number = " + Arrays.toString(number));
		
		input.close();
		
	}
}
		