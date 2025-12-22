// Program to compare two strings

import java.util.Scanner;

public class CompareString{
	
	// check whether two strings are equal or not
	public static boolean checkString( String firstString , String secondString){
		
		if (firstString.length() != secondString.length()){
			return false;
		}
		
		if (firstString.equals(secondString)){
			return true;
		
		}
			
		return false;
		
	}
	
	
	
	public static void main (String[] args){
		
		CompareString compare = new CompareString();
		
		// create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Enter first and second string
		System.out.println("Enter first String:");
		String firstString = input.nextLine();
		System.out.println("Enter second String:");
		String secondString = input.nextLine();
		
		boolean result = compare.checkString( firstString, secondString);
		
		// Print the result
		System.out.println("Both Strings are equal? " + result);
		
		input.close();
		
	}
}
