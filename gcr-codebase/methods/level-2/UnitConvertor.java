// Create a UnitConvertor

import java.util.Scanner;

public class UnitConvertor{
	
	// Method To convert kilometers to miles 
	public static double convertKmToMiles(double kilometer){
		
		double km2miles = 0.621371 * kilometer;
		
		return km2miles;

	}
	
	// Method to convert miles to kilometers
	public static double convertMilesToKm(double miles){
		
		double miles2km = 1.60934 * miles;

		return miles2km;
	}
	
	// Method to convert meters to feet 
	public static double convertMetersToFeet(double meters){
		
		double meters2feet = 3.28084 * meters;
		
		return meters2feet;

	}
	
	// Method to convert feet to meters
	public static double convertFeetToMeters(double feet){
		
		double feet2meters = 0.3048 * feet;
		
		return feet2meters;

	}
	
	public static void main (String[] args){
		
		UnitConvertor convertor = new UnitConvertor();
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Take km, meter, miles and feet as user input
		System.out.println("Enter the kilometer: ");
		double kilometer = input.nextDouble();
		
		System.out.println("Enter the miles: ");
		double miles = input.nextDouble();
		
		System.out.println("Enter the meter: ");
		double meter = input.nextDouble();
		
		System.out.println("Enter the feet: ");
		double feet = input.nextDouble();
		
		// Print km to miles conversion
		double kilometerToMiles = convertor.convertKmToMiles(kilometer);
		System.out.println(kilometer + "km = " + kilometerToMiles + "miles");
		
		// print miles to kilometer
		double milesToKm = convertor.convertMilesToKm(miles);
        System.out.println(miles + "miles = " + milesToKm + "km");

		// print meter to feet
		double meterToFeet = convertor.convertMetersToFeet(meter);
		System.out.println(meter + "meter = " + meterToFeet + "feet");
		
		// print feet to meter
		double feetToMeter = convertor.convertFeetToMeters(feet);
		System.out.println(feet + "feet = " + feetToMeter + "meter");
		
		input.close();
		
	}
	
}