// Program to count down the number from the user input value to 1 using a while loop for a rocket launch

import java.util.Scanner;
public class CountDown{
	public static void main(String[] args){
		int number;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take number as input
		System.out.println("Enter the number : ");
		number = input.nextInt();
		
		// Use while loop for count down number
		while ( number >= 1 ){
			System.out.println( number );
			number -- ;
		}
		
		input.close();
		
	}
}
		