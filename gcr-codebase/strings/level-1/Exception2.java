// Program to demonstrate NullPointerException. 

import java.util.Scanner;
public class Exception2{
	
	public static void generateException(){
		String text = null;
		System.out.println("This is the generated exception " + text.length());
	}
	
	public static void demonstrateException(){
		String text = null;
		
		try{
			System.out.println("Attempting to get length...");
			System.out.println("the length contains null value " + text.length());
		}
		catch(NullPointerException e){
			System.out.println("This text contains null value" + e);
		}
	}
			
	
	public static void main(String[] args){
		
		// Call Demonstrate exception method
		demonstrateException();
		
		// Print Generate the exception method
		//generateException();
		
	}
}
		
		
		