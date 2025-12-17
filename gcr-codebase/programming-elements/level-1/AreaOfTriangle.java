// Program to ind area of a triangle in square inches and square centimeters 

import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		double base;
		double height;
		
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking height and base as input;
		System.out.println("Enter Height: ");
		height = input.nextDouble();
		System.out.println("Enter Base: ");
		base = input.nextDouble();
		
		// Calculate the area of triangle
		double area = (base * height ) /2;
		
		// Print the area of triangle
		System.out.println("Area of triangle: " + area);
		
	}
}

		
		


