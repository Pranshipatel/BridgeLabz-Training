// Program to demonstrate StringIndexOutOfBoundsException

import java.util.Scanner;

public class StringException{
	
	public static void generateException(String text){
		System.out.println(text.charAt(10));
	}
	
	public static void demonstrateException(String text){
		try{
			System.out.println("The expected text is " + text.charAt(10));
		}
		catch (StringIndexOutOfBoundsException e){
			System.out.println("String Exception");
		}
	}
		
	
	public static void main (String[] args){
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Take text as user input
		System.out.println("Enter the text: ");
		String text = input.nextLine();
		
		demonstrateException(text);
		
		generateException(text);
		
	}
}
		