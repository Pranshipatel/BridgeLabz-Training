// Program to find double Operation

import java.util.Scanner;
public class DoubleOperation{
	public static void main(String[] args){
		double a;
		double b;
		double c;
		
		// Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take a, b, c as user input;
		System.out.println("Enter value of a :");
		a = input.nextInt();
		System.out.println("Enter value of b :");
		b = input.nextInt();
		System.out.println("Enter value of c :");
		c = input.nextInt();
		
		double operationOne =  a + (b *c) ;
		double operationTwo = (a * b) + c ;
		double operationThree = (a % b) + c ;
		
		// Print the result of operationOne
		System.out.println("a + (b * c) = " + operationOne);
        System.out.println("(a * b) + c = " + operationTwo);
        System.out.println("(a % b) + c = " + operationThree);

		input.close();
		
	}
}
		
		