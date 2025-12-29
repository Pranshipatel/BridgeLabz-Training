// The Number Guessing Game 🎲 Program

import java.util.Scanner;
public class NumberGuessingGame{
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		System.out.println("This is the number guessing game ---");
		System.out.println("------------------------------------------");
		
		int randomNumber = (int)(Math.random() * 100) + 1;
		int attempt = 0;
		int userInput;
			
		do{
			// Take number as user input from 1 to 100
			System.out.println("Enter number between 1 to 100 ");
			userInput = input.nextInt();
			attempt++;
			
			if (userInput < 1 || userInput > 100) {
              System.out.println("Please enter a number between 1 and 100");
              continue;
            }
			
			if(userInput > randomNumber){
				System.out.println("The Number you guessed is too high");
			} else if (userInput < randomNumber) {
				System.out.println("The number you guessed is too low");
			} else if(userInput == randomNumber){
				System.out.println("Yesss, You guessed it right");
				break;
			}
			
		    if(attempt < 5) System.out.println(5 - attempt + " attempts left");
			
		} while (attempt < 5);
		
		System.out.println("Game Over");
		input.close();
	
	}
}		