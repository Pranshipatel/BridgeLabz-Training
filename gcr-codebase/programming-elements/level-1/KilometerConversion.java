//  program to convert distance in kilometers to miles.

import java.util.Scanner;

public class KilometerConversion{
	
	public static void main (String[] args){
		
		//Create a variable km and assign type as double as in double km;
		double km;
		
		// Create Scanner Object to take user input from Standard Input that is the Keyboard
		Scanner input = new Scanner(System.in);
		
		// Use Scanner Object to take user input for km
		System.out.println("Enter the km : ");
		km = input.nextInt();
		
		// Convert km into miles
		double miles = km * 1.6;
		
		// Print the value of km in miles
		System.out.println("The total miles is " + miles + " mile for the given " + km + "km");
		
	}
}	
		
 
         