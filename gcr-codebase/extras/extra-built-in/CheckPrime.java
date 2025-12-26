// Program that checks whether a given number is a prime number.

import java.util.Scanner;
public class CheckPrime{
	
	public static boolean isPrime(int number){
		if(number == 2) return true;
		if(number < 2) return false;
		if(number % 2 == 0) return false;
		return true;
	}
	
	
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take number as input
		System.out.println("Enter the number");
		int number = input.nextInt();
		
		boolean result = isPrime(number);
		
		// Print the result
		System.out.println("The given number is Prime?? " + result);
		
	}
}
