// Program to find the factors of a number taken as user input.

import java.util.Scanner;
public class FactorNumber{
	public static void main(String[] args){
		int number;
	
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// Using loop to find the factors of number
		System.out.println("Factors of " + number + " are " );
		for(int i = 1 ; i < number ; i++){
			if ( number % i == 0 ){
				System.out.println( i );
			}
		}
		
		input.close();
		
	}
}