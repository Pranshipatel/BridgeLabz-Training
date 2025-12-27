// Program to find BMI

import java.util.Scanner;

public class BMI{
	
	// Method to calculate BMI
	public static double calculateBMI(double heightOfClient, double weightOfClient){
		double bmi = weightOfClient / (heightOfClient * heightOfClient);
		return bmi;
	}
	
	
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Taking Height of the client as user input
		System.out.println("Enter Height : ");
		double heightOfClient = input.();nextDouble();
		
		// Taking Weight of the client as user input
		System.out.println("Enter Weight : ");
		double weightOfClient = input.nextDouble();
		
	    double bmi = calculateBMI(heightOfClient, weightOfClient);
		
		// Print the bmi of client
		System.out.println("Bmi of the client is : " + bmi);
		
		input.close();
		
	}
}
