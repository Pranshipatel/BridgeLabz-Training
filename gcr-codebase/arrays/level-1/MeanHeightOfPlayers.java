// Program to find the mean height of players present in a football team.

import java.util.Scanner;
public class MeanHeightOfPlayers{
	public static void main (String[] args){
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Creating a height array of type Double
		double heights[] = new double[11];
		
		// Taking the input values from user in heights array using for loop
		for( int i = 0 ; i < heights.length ; i++ ){
			System.out.println("Enter the height of player " +  i );
			heights[i] = input.nextDouble();
		}
		
		// Creating sum variable to calculate the sum of all elements
		double sumOfElements = 0;
		
		// Calculating the sum of all elements
		for( int i = 0 ; i < heights.length ; i++ ){
			sumOfElements += heights[i];
		}
		
		// Calculating the mean height
		double meanHeight = sumOfElements / 11;
		
		// Print the mean height
		System.out.println("The mean height of all players is = " + meanHeight);
		
		input.close();
		
	}
}	
		