// Program to print a multiplication table of a number.

import java.util.Scanner;
public class MultiplicationTable{
	public static void main (String[] args){
	  // Create a Scanner Object
      Scanner input = new Scanner(System.in);
	  
	  // Take number as input from user
	  System.out.println("Enter the number");
	  int number = input.nextInt();
	  
	  // Creating the array of size 
	  int array[] = new int[11];
	  
	  System.out.println(" Enter the 5 input numbers");
	  // Take input in an array using loop
	  for ( int i = 1 ; i <= 10 ; i++ ){
		  // Store the value of table in array
		  array[i] = number * i;
	  }
	  
	  // Printing the table
	  for ( int i = 1 ; i <= 10 ; i++ ){
		  System.out.println( number + " * " + i + " = " + array[i]);
	  }
	  
	  input.close();
	
	}
}
