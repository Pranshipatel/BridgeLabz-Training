// Program to print odd and even numbers between 1 to the number entered by the user.

import java.util.Scanner;
public class EvenAndOdd{
	public static void main (String[] args){
		int number;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// Print the even and odd number using for loo
		for(int i = 1; i <= number ; i++ ){
			if ( i % 2 == 0 ){
				System.out.println("The number " + i + " is even");
			} else {
				System.out.println("The number " + i + " is odd");
			}
		}
		
		input.close();
	
	}
}
