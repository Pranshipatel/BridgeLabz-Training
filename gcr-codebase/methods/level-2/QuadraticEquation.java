// Program Quadratic to find the roots of the equation ax2+ bx + c

import java.util.Scanner;

public class QuadraticEquation{
	
	// method to calculate th e root
	public static double calculateRoot( double a, double b, double c ){
		
		double delta = (b * b) + 4 * a * c;
		double rootX;
		
		if (delta > 0 ){
			rootX =  (-b + delta) / (2*a);
		} else {
			rootX =  (-b - delta) / (2*a);
		}
		
		return rootX;
	}
	
	
	public static void main (String[] args){
		
		QuadraticEquation equation = new QuadraticEquation();
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Take a, b, c as user input
		System.out.println("Enter a: ");
		double a = input.nextDouble();
		
		System.out.println("Enter b: ");
		double b = input.nextDouble();
		
		System.out.println("Enter c: ");
		double c = input.nextDouble();
		
		double result = equation.calculateRoot(a, b, c);
		
		// Print the result
		System.out.println("The root of a, b and c : " + result);
		
		input.close();
		
	}
	
}
		