// Program to store the digits of the number in an array and find the largest and second largest element of the array.

import java.util.Scanner;

public class LargestAndSecondLargest{
	public static void main (String[] args){
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		int maxDigit = 10;
		
		// initializing the array to size 10
		int array[] = new int[maxDigit];
		
		int index = 0;
		
		// adding values to array
		while( number != 0 ){
			int remainder = number % 10 ;
			array[index] = remainder;
			number = number / 10;
			
			if( index == maxDigit ){
				break;
			}
			
			index++;
		}
		
		// Create a variable to store largest and second largest Number
		int largestNumber = Integer.MIN_VALUE;
		int secondNumber = Integer.MIN_VALUE;
		
		
		for(int i = 0; i < array.length ; i++){
			
			// Find the largest number
		   if(array[i] > largestNumber){
			 largestNumber = array[i];
		   }
		
		   // find the second largest number
		   if(array[i] > secondNumber && array[i] != largestNumber ){
			 secondNumber = array[i];
		   }
		}
		
		// Print the largest and second largest Number
		System.out.println("Largest Number = " + largestNumber);
		System.out.println("Second Largest Number " + secondNumber);
		
		input.close();
		
	}
}
			

	