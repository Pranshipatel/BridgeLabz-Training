// Program to find the sum of numbers until the user enters 0

import java.util.Scanner;
public class SumOfNumbers{
	public static void main(String[] args){
		int number;
	
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// Create variable total 
		double total = 0.0 ;
		
		// Calculate the sum of numbers until the user enters 0
		if ( number > 0 ) {
			while ( number != 0 ){
				total = total + number;
				System.out.println("Enter the number again");
			    number = input.nextInt();
			}
			System.out.println("Total value is = " + total);
		} else {
			System.out.println("The value entered by user is 0");
		}
		
		input.close();
	
	}
}
			
		
		
		

		
		