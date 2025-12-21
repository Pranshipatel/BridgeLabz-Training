// LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 

import java.util.Scanner;
public class LeapYear{
	
	public static boolean checkLeapYear( int year ){
		if ( year >= 1582 ){
			if ( ( year % 4 == 0 && year % 100 != 0 ) || ( year % 400 == 0 ) ) {
				return true;
			}  else {
			    return false;
		    }
		} else {
            return false;
        }
	}
	
	
	public static void main (String[] args){
		int year;
		
		LeapYear leapYear = new LeapYear();
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Taking year as input from user
		System.out.println("Enter the year : ");
		year = input.nextInt();
		
		boolean result = leapYear.checkLeapYear(year);
		
		// Print the result
		System.out.println(year + " is a leap Year : " + result);
		
		input.close();


	}
}