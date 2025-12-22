// Program to demonstrate ArrayIndexOutOfBoundsException

import java.util.Scanner;

public class ArrayException{
	
	public static void generateException(int array[]){
		System.out.println("This is the generated exception " + array[111]);
	}
	
	public static void demonstrateException(int array[]){
		
		try{
			System.out.println("Attempting to get length...");
			System.out.println("the length contains null value " + array[111]);
		}
		catch(NullPointerException e){
			System.out.println("This text contains null value" + e);
		}
	}
			
	
	public static void main(String[] args){
		
		// create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Take text as user input
		System.out.println("Enter the size");
		int size = input.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("Enter array values");
		for(int i = 0; i < size ; i++ ){
			array[i] = input.nextInt();
		}
		
		demonstrateException(array);
		
		//generateException(array);
		
		
	
	}
}