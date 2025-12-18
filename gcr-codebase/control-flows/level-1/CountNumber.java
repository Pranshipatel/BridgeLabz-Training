// Countdown using the for-loop

import java.util.Scanner;
public class CountNumber{
	public static void main(String[] args){
		int number;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// Use for loop for count down number
		for ( ; number >= 1 ; number --){
			System.out.println( number );
		}
		
		input.close();
		
	}
}