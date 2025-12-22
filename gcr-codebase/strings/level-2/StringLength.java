// Program to find and return the length of a string without using the length() method 

import java.util.Scanner;

public class StringLength{
	public static int lengthOfString1(String text){
		int count = 0;
		
		for(char a : text.toCharArray()){
			count++;
		}
		return count;
	}
	
	public static int lengthOfString2(String text){
		return text.length();
	}
	
	public static void main (String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take text as user input
		System.out.println("Enter the text");
		String text = input.nextLine();
		
		// Get length from user calculation
		int length1 = lengthOfString1(text);
		
		// Get length from built-in method
		int length2 = lengthOfString2(text);
		
		System.out.println("length1 = " + length1);
		
		System.out.println("length2 = " + length2);
		
		System.out.println("Length1 and Length is equal ? " + (length1 == length2));
		
		input.close();
		
	}
}

		
		
		