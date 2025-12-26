// Program for Fibonacci Sequence Generator:

import java.util.Scanner;

public class FibonacciSequence{
	public static void generateFibonacci(int number){
		int a = 0;
		int b = 1;
		for(int i = 0; i < number ; i++){
			System.out.println(a);
			int temp = a + b;
			a = b;
			b = temp;
		}
	}
	
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take number as input
		System.out.println("Enter the number");
		int number = input.nextInt();
		
		generateFibonacci(number);
		
		input.close();
	}
}
