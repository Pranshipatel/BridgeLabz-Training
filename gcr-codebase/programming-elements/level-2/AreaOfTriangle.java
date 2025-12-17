// Program to ind area of a triangle in square inches and square centimeters 

import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		double base;
		double height;
		
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking height and base as input in inches;
		System.out.println("Enter Height: ");
		height = input.nextDouble();
		System.out.println("Enter Base: ");
		base = input.nextDouble();
		
		// Calculate area in square inches
        double areaInSquareInches = (base * height) / 2;

        // Convert area to square centimeters
        double areaInSquareCm = areaInSquareInches * 6.4516;

        // Print results
        System.out.println("Area of triangle in square inches: " + areaInSquareInches);
        System.out.println("Area of triangle in square centimeters: " + areaInSquareCm);

        input.close();

		
	}
}

		
		


