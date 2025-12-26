// Program that calculates the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two numbers using functions.

import java.util.Scanner;

public class GCDAndLCM{
	
	public static int calculateLcm(int a, int b){
		int gcd = calculateGcd(a, b);
        return (a * b) / gcd;
        
	}
	
	public static int calculateGcd(int number1, int number2){
		while (number2 != 0){
			int remainder = number1 % number2;
			number1 = number2;
			number2 = remainder;
		}
		return number1;
	}
	
	public static void main(String[] args){
		
		// Create a Scanner Object 
		Scanner input = new Scanner(System.in);
		
		// Take numbers as user input 
		System.out.println("Enter the first number");
		int number1 = input.nextInt();
		
		System.out.println("Enter the second number");
		int number2 = input.nextInt();
		
		int lcm = calculateLcm(number1, number2);
		
		int gcd = calculateGcd(number1, number2);
		
		System.out.println("Lcm of two number = " + lcm);
		
		System.out.println("Gcd of two number = " + gcd);
		
		input.close();
		
	}
}
