// Calculate the rounds athlete must complete

import java.util.Scanner;

public class NumberOfRounds{
	
	// method to calculate total rounds athelete must run
	public double numberOfRoundsCalculation( double perimeterOfTriangle, double distance){
		
		// Calculate total rounds
		double totalRounds = ( distance / perimeterOfTriangle );
		
		return totalRounds;
		
	}
	
	
	public static void main (String[] args){
		
		NumberOfRounds numberOfRounds = new NumberOfRounds();
		
		// Create Scanner object
        Scanner input = new Scanner(System.in);
		
		 // Take side of triangle as user input
        System.out.println("Enter side 1:");
        double sideOne = input.nextDouble();
		System.out.println("Enter side 2:");
        double sideTwo = input.nextDouble();
		System.out.println("Enter side 3:");
        double sideThree = input.nextDouble();
		
		// Take distance as user input
		System.out.println("Enter distance:");
        double distance = input.nextDouble();
		
		// Calculate perimeter of triangle
		double perimeterOfTriangle = sideOne + sideTwo + sideThree;
		
		// Get total Rounds athlete must complete
		double totalRounds = numberOfRounds.numberOfRoundsCalculation(perimeterOfTriangle, distance);
		
		// Print the result
		System.out.println("Athlete must complete " + totalRounds + " rounds for distance " + distance + "km");
		
		input.close();
		
	}
}

		
		
		