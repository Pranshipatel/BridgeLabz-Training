// Program to find the sum of numbers until the user enters 0

import java.util.Scanner;
public class SumOfNumbers2{
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
		while ( number > 0 ){
			total = total + number;
			System.out.println("Enter the number again");
			number = input.nextInt();
				
			// check whether the number is less then 0
			if ( number <= 0 ){
			   break;
			}
					
		}
		
		// Print the total value
		System.out.println("The total value is " + total);
		
		input.close();
	
	}
}
			
		
		
		

		
		