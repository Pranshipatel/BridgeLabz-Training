// Program to store multiple values in an array up to a maximum of 10

import java.util.Scanner;
public class SumOfNumber{
	public static void main (String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// create the array of type double
		double array[] = new double[10];
		
		// create a double variable 
		double number ;
		
		int i = 0;
		// Using while loop to check and store the positive values
		while(true){
			System.out.println("Enter the number : ");
			number = input.nextDouble();
			if ( number <= 0 ){
				break;
			}
			
			array[i] = number;
			i++;
		}
		
		// Calculating the sum of positive number in array
		double sum = 0;
		for ( int j = 0; j < array.length ; j++){
			sum = sum + array[j];
		}
		
		// Print the sum of numbers
		System.out.println("The sum of positive number is " + sum );
		
		input.close();
		
	}
}
