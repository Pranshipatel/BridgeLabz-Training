// Program SpringSeason that takes two int values month and day from the command line

import java.util.Scanner;
public class SpringSeason{
	
	// Method to check Spring Season
	public boolean checkSeason(int month, int day){
		
		// Check Spring Season is from March 20 to June 20
        if( ( month >= 3 && day >= 20 ) || (month <= 6 && day <= 20 )){
			return true;
		} else {
			return false;
		}
		
	}
	
	
	public static void main(String[] args){
		int month;
		int day;
		
		SpringSeason springSeason = new SpringSeason();
		
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take month and day as input
		System.out.println("Enter the month : ");
		month = input.nextInt();
		System.out.println("Enter the day : ");
		day = input.nextInt();
		
		// Get the result
		boolean result = springSeason.checkSeason(month, day);
		
		// Print the result
		if ( result ){
			System.out.println("Is a Spring Season");
		} else {
			System.out.println("Not a Spring Season");
		}
		
		
		input.close();
		
	}
}
			
			