// Program to find integer Operation

import java.util.Scanner;
public class IntOperation{
	public static void main(String[] args){
		int a;
		int b;
		int c;
		
		// Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take a, b, c as user input;
		System.out.println("Enter value of a :");
		a = input.nextInt();
		System.out.println("Enter value of b :");
		b = input.nextInt();
		System.out.println("Enter value of c :");
		c = input.nextInt();
		
		int operationOne =  a + (b *c) ;
		int operationTwo = (a * b) + c ;
		int operationThree = (a % b) + c ;
		
		// Print the result of operationOne
		System.out.println("a + (b * c) = " + operationOne);
        System.out.println("(a * b) + c = " + operationTwo);
        System.out.println("(a % b) + c = " + operationThree);

		input.close();
		
	}
}
		
		