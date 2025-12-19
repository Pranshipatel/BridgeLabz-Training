// Program to take user input for 5 numbers and check

import java.util.Scanner;

public class NumberCheck{
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
		  
		  // check if number is positive
		  if ( array[i] > 0 ){
			  
			  // check if number is even or odd
			  if ( array[i] % 2 == 0){
				  System.out.println("number " + array[i] + " is positive even number");
			  } else {
				  System.out.println("number " + array[i] + " is positive odd number");
			  }
			  
		  } else {
			  System.out.println("number " + array[i] + " is not positive number");
		  }
	  }
	  
	  // compare the first and last elements of the array 
	  if ( array[0] > array[array.length-1] ) {
		  System.out.println("First number is greater");
	  } else if ( array[0] < array[array.length-1] ) {
		  System.out.println("Last number is greater");
	  } else {
		   System.out.println("Both number are equal");
	  }
	  
	  input.close();
	  
	}
}
		  
		  
		  
	  
	  
		