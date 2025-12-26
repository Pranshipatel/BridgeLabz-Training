// program where the user thinks of a number between 1 and 100, and the computer tries to guess the number by generating random guesses.

import java.util.Scanner;

public class RandomNumber{
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take number as input
		System.out.println("Enter the number");
		int number = input.nextInt();

        int randomNumber = (int) (Math.random() * (100 - 1 + 1) + 1);
		
		System.out.println("randomNumber = " + randomNumber);
		
		if ( number > randomNumber){
			System.out.println("Number is high then randomNumber");
		} else if (number < randomNumber){
			System.out.println("Number is low then randomNumber");
		} else {
			System.out.println("Correct Number");
		}
		
		input.close();
		
	}
	
}