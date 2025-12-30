// Sandeeop's Fitness Challenge Tracker 🏋️

import java.util.Scanner;
public class FitnessTracker{
	
	// method to find average no of push-ups and total push up
	public static int[] calculateAverageAndTotal(int noOfPushUp[]){
		int average[] = new int[2];
		int sum = 0;
		
		// Loop to calculate sum and max Temperature
		for(int i = 0 ; i < noOfPushUp.length ; i++){
			sum += noOfPushUp[i];
		
		}
		// Calculate average Temperature
		average[0] = sum / 7;
		average[1] = sum;
		
		return average;
	}
	
	
	// Method to display temperature of all days, max Temperature and average of all temperature
	public static void displayTracker(Scanner input){
		
		String dayAndPushup[][] = new String[7][2];
		String days[] = {"Sunday   ", "Monday   ", "Tuesday   " , "Wednesday", 
		                 "Thursday" , "Friday   ", "Saturday"};
						 
		int noOfPushUp[] = new int[7];
		
		System.out.println("Enter count of push-up if gym day for skip day enter '-1' ");
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		
		for(int i = 0; i < noOfPushUp.length ; i++){
			System.out.println("Enter number of push up for " + days[i]);
			noOfPushUp[i] = input.nextInt();
		}
		
		
		int averageAndTotal[] = calculateAverageAndTotal(noOfPushUp);
		
		for(int i = 0; i < dayAndPushup.length ; i++){
			dayAndPushup[i][0] = days[i];
			if(noOfPushUp[i] == -1){
				dayAndPushup[i][1] = "Skip Day";
			} else {
			    dayAndPushup[i][1] = noOfPushUp[i] + " Push-ups " ;
			}
		}
		
		System.out.println("Days \t\t\t Push-ups Count");
		System.out.println("--------------------------------------------");
		for(int i = 0; i < dayAndPushup.length ; i++){
			System.out.println(dayAndPushup[i][0] + "\t\t" + dayAndPushup[i][1]);
		}
		
		// Display the average and total
		System.out.println("Average push-ups for 7 days = " + averageAndTotal[0]);
		System.out.println("Total Push-ups in 7 days was = " + averageAndTotal[1] );
	}
		
		
	
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		displayTracker(input);
	}
}
			