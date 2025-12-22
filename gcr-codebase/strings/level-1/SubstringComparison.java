// Program to create a substring from a String using the charAt() method

import java.util.Scanner;

public class SubstringComparison{
	
	// method to create substring
	public static String createSubstring(String text, int start, int end){
		StringBuilder sb = new StringBuilder();
		for(int i = start ; i < end ; i++ ){
			sb.append(text.charAt(i));
		}
		return sb.toString();
	}
	
	// method to compare two strings
	public static boolean compareSubstring(String firstString, String secondString){
		return firstString.equals(secondString);
	}
	
	
	public static void main (String[] args){
		
		SubstringComparison compare = new SubstringComparison();
		
		// create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Enter first and second string
		System.out.println("Enter first String:");
		String text = input.nextLine();
		
		// Take start and end as user input
		System.out.println("Enter Start: ");
		int start = input.nextInt();
		System.out.println("Enter end: ");
		int end = input.nextInt();
		
		// Get the first String
		String firstString = compare.createSubstring(text, start, end);
		
		// Get the second String
		String secondString = text.substring(start, end);
		
		System.out.println("firstString = " + firstString + " secondString = " + secondString);
		
		// Compare both string
		boolean result = compare.compareSubstring(firstString, secondString);
		
		// Print the result
		System.out.println("Both Strings are equal? " + result);
		
		input.close();
		
	}
}