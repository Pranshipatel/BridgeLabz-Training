// Program that calculates the factorial of a number using a recursive function.

import java.util.Scanner;
public class FactorialNumber{
	public static int generateFactors(int number){
		if(number <= 1 ) return 1;
		return number * generateFactors(number - 1 );
	}
	
	
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take number as input
		System.out.println("Enter the number");
		int number = input.nextInt();
		
	    int result = generateFactors(number);
		System.out.println(result);
		
		input.close();
		
	}
}