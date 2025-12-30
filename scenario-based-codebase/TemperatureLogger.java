// Temperature Logger Program for 7 days

import java.util.Scanner;
public class TemperatureLogger{
	
	// method to find max Temperature
	public static double maxTemperature(double temperature[]){
		double maxTemperature = Integer.MIN_VALUE;
		
		// Loop to calculate sum and max Temperature
		for(int i = 0 ; i < temperature.length ; i++){
			// Max Temperature
			if(temperature[i] > maxTemperature){
				maxTemperature = temperature[i];
			}
		}
		
		return maxTemperature;
	}
	
	// method to find average temperature
	public static double averageTemperature(double temperature[]){
		double average = 0;
		double sum = 0;
		
		// Loop to calculate sum and max Temperature
		for(int i = 0 ; i < temperature.length ; i++){
			sum += temperature[i];
		
		}
		// Calculate average Temperature
		average = sum / 7;
		
		return average;
	}
	
	// Method to display temperature of all days, max Temperature and average of all temperature
	public static void displayTemperature(Scanner input){
		String dayAndTemp[][] = new String[7][2];
		String days[] = {"Sunday   ", "Monday   ", "Tuesday   " , "Wednesday", "Thursday" , "Friday   ", "Saturday"};
		double temperature[] = new double[7];
		
		for(int i = 0; i < temperature.length ; i++){
			System.out.println("Enter Temperature in celcius for " + days[i]);
			temperature[i] = input.nextDouble();
		}
		
		double maxTemperature = maxTemperature(temperature);
		
		double average = averageTemperature(temperature);
		
		for(int i = 0; i < dayAndTemp.length ; i++){
			dayAndTemp[i][0] = days[i];
			dayAndTemp[i][1] = temperature[i] + " C " ;
		}
		
		System.out.println("Days \t\t\t Temperature");
		System.out.println("----------------------------------");
		for(int i = 0; i < dayAndTemp.length ; i++){
			System.out.println(dayAndTemp[i][0] + "\t\t\t" + dayAndTemp[i][1]);
		}
		
		// Display the average and max temperature
		System.out.println("Average Temperature for 7 days = " + average);
		
		System.out.println("Max Temperature in 7 days was = " + maxTemperature );
	}
		
		
	
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		displayTemperature(input);
		
		
	}
}
			