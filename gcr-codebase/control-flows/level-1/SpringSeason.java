// Program SpringSeason that takes two int values month and day from the command line

import java.util.Scanner;
public class SpringSeason{
	public static void main(String[] args){
		int month;
		int day;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take month and day as input
		System.out.println("Enter the month : ");
		month = input.nextInt();
		System.out.println("Enter the day : ");
		day = input.nextInt();
		
		// Check Spring Season is from March 20 to June 20
        if( ( month >= 3 && day >= 20 ) || (month <= 6 && day <= 20 )){
			System.out.println("Its a Spring Season");
		} else {
			System.out.println("Not a Spring Season");
		}
		
		input.close();
		
	}
}
			
			