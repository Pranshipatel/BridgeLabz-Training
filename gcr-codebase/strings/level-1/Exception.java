// Program to demonstrate IllegalArgumentException

import java.util.Scanner;

public class Exception{
	
	public static void generateException(String text){
		System.out.println("Generate the exception");
		System.out.println(text.substring(6,3));
	}
	
	public static void demonstrateException(String text){
		try{
			System.out.println("Generate the exception");
		    System.out.println(text.substring(6,3));
		} catch ( IllegalArgumentException e ){
			System.out.println("Exception" + e);
		}
	}
	
	public static void main(String[] args){
		
		// create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Take text as user input
		System.out.println("Enter the text");
		String text = input.nextLine();
		
		generateException(text);
		
		demonstrateException(text);
		
	}
	
}