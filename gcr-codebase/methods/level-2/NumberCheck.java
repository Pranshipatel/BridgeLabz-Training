// Program to take user input for 5 numbers and check

import java.util.Scanner;

public class NumberCheck{
	
	public static boolean isPositive( int number) {
		
		// Check whether a number is positive, negative, or zero.
		if ( number >= 0 ){
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean isEven( int number) {
		
		// Check whether a number is even or odd
		if ( number % 2 ==  0 ){
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void compare( int array[] , int last[]){
		
		// compare the first and last elements of the array 
	  if ( array[0] > array[array.length-1] ) {
		  System.out.println("First number is greater");
	  } else if ( array[0] < array[array.length-1] ) {
		  System.out.println("Last number is greater");
	  } else {
		   System.out.println("Both number are equal");
	  }
	  
	}
	
	public static void main (String[] args){
	  // Create a Scanner Object
      Scanner input = new Scanner(System.in);
	  
	  // Creating the array of size 5
	  int array[] = new int[5];
	  
	  System.out.println(" Enter the 5 input numbers");
	  // Take input in an array using loop
	  for ( int i = 0 ; i < array.length ; i++ ){
		  // Store student age in array
		  array[i] = input.nextInt();
	  }
	  
	  
	  for ( int i = 0 ; i < array.length ; i++ ){
		  
		  if ( isPositive(array[i]) ){
			  
			  if ( isEven(array[i]) ){
				  System.out.println(array[i] + " is positive and even");
			  } else {
				  System.out.println(array[i] + " is positive and odd");
			  }
			  
		  } else {
			  System.out.println("Negative number");
		  }
		  
	  }
	  
	  compare(array[0], array[array.length-1]);
	  
	  input.close();
	  
	}
}
		  
		  
		  
	  
	  
		