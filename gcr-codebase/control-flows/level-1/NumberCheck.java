// Program to check whether a number is positive, negative, or zero.

import java.util.Scanner;
public class NumberCheck{
	public static void main(String[] args){
		int number;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// Check whether a number is positive, negative, or zero.
		if ( number > 0 ){
			System.out.println(number + " is postive");
		} else if ( number < 0 ) {
			System.out.println(number + " is negative");
		} else {
			System.out.println(number + " is zero");
		}
		
		input.close();
	}
}