// Program to takes your height in centimeters and converts it into feet and inches

import java.util.Scanner;
public class HeightConversion{
	public static void main (String[] args){
		
		//Create Scanner Object to take user input from Standard Input
		Scanner input = new Scanner(System.in);
		// Take height as input from user
		System.out.println("Enter the height in cm: ");
		double height = input.nextDouble();
		
		// Calculate the height in inches and feet
		double inches = height * 0.393701;
		double feet = height * 0.0328084;
		
		// Print the height in cm, feet and inches
		System.out.println("Your Height in cm is " + height + " while in feet is  " + feet + " and inches is " + inches );
		
	}
}

		