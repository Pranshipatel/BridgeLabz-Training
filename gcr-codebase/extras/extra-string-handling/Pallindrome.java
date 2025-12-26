// Program to check if a given string is a palindrome

import java.util.Scanner;

public class Pallindrome{
	
	// method to check pallindrome
	public static boolean isPallindrome(String text){
		String originalText = text;
		String reverse = "";
		
		for(int i = text.length() - 1 ; i >= 0 ; i--){
			reverse += text.charAt(i);
		}
		
		return reverse.equals(originalText);
	}
	
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take string as user input
		System.out.println("Enter the text");
		String text = input.nextLine();
		
		boolean result = isPallindrome(text);
		
		System.out.println("Text is Pallindrome?? " + result);
		
	}
}