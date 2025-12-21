// Create a UnitConvertor

import java.util.Scanner;

public class UnitConvertor2{
	
	// Method To convert farhenheit to celcius
	public static double convertFarhenheitToCelsius(double farhenheit){
		
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
		return farhenheit2celsius;

	}
	
	// Method to convert celcius to farhenheit
	public static double convertCelciusToFarhenheit(double celsius){
		
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
		
	}
	
	// Method to convert pound to kilograms
	public static double convertPoundsToKilograms(double pound){
		
		double pounds2kilograms = 0.453592 * pound;
		return pounds2kilograms;

	}
	
	// Method to convert kilograms to pound
	public static double convertKilogramToPound(double kilograms){
		
		double kilograms2pounds = 2.20462 * kilograms; 
		return kilograms2pounds ;

	}
	
	public static void main (String[] args){
		
		UnitConvertor2 convertor = new UnitConvertor2();
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Take farhenheit, celcius, pound as user input
		System.out.println("Enter the farhenheit: ");
		double farhenheit = input.nextDouble();
		
		System.out.println("Enter the celcius: ");
		double celcius = input.nextDouble();
		
		System.out.println("Enter the pounds: ");
		double pound = input.nextDouble();
		
		System.out.println("Enter the kilograms: ");
		double kilograms = input.nextDouble();
		
		// Print farhenheit to celcius conversion
		double farhenheitToCelcius = convertor.convertFarhenheitToCelsius(farhenheit);
		System.out.println(farhenheit + "farhenheit = " + farhenheitToCelcius + "celcius");
		
		// print celcius to farhenheit
		double celciusToFarhenheit = convertor.convertCelciusToFarhenheit(celcius);
        System.out.println(celcius + "celcius = " + celciusToFarhenheit + "farhenheit");

		// print pounds to kilograms
		double poundsToKilogram = convertor.convertPoundsToKilograms(pound);
		System.out.println(pound + "pound = " + poundsToKilogram + "kg");
		
		// print kilograms to pound
		double kilograms2pounds = convertor.convertKilogramToPound(kilograms);
		System.out.println(kilograms + "kg = " + pound + "pounds");
		
		input.close();
		
	}
	
}