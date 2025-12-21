// Program calculate the wind chill temperature given the temperature and wind speed

import java.util.Scanner;

public class WindChill{
	
	// method to calculate wind chill
	public double calculateWindChill(double temperature, double windSpeed){
		
		double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
		
		return windChill;
		
	}

	
	public static void main (String[] args){
		
		WindChill windChill = new WindChill();
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Take temperature and windSpeed as user input
		System.out.println("Enter the temperature: ");
		double temperature = input.nextDouble();
		
		System.out.println("Enter the wind speed: ");
		double windSpeed = input.nextDouble();
		
		// Get the wind chill temperature
		double result = windChill.calculateWindChill(temperature, windSpeed);
		
		// Print the wind chill temperature
		System.out.println("wind chill temperature = " + result);
		
		
		input.close();
		
	}
	
}
		