// Program the find the distance in yards and miles for the distance provided by user in feets

import java.util.Scanner;
public class Distance{
	public static void main(String[] args){
		int distanceInFeet;
		
		// Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take Distance as input
		System.out.println("Enter Distance in feet: ");
		distanceInFeet = input.nextInt();
		
		// Conversion of Distance in yards and miles
		double yards = distanceInFeet * 0.333333;
		double miles = distanceInFeet * 0.000189394;
		
		// Print Distance in Yards and Miles
		System.out.println("Distance in Yards is " + yards + " and in miles is " + miles);
		
	}
}
		
		
         

