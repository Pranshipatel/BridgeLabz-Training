// Program to demonstrate NumberFormatException

import java.util.Scanner;

public class FormatException{
	
	public static void generateException(String text){
		System.out.println("Generate the exception");
		System.out.println( Integer.parseInt(text) );
	}
	
	public static void demonstrateException(String text){
		try{
			System.out.println("Generate the exception of text");
		    System.out.println(text.substring(6,3));
		} catch ( IllegalArgumentException e ){
			System.out.println("Exception" + e);
		}
	}
	
	public static void main (String[] args){
		
		// create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Take text as user input
		System.out.println("Enter the text");
		String text = input.nextLine();
		
		demonstrateException(text);
		
		//generateException(text);
	
	}
	
}