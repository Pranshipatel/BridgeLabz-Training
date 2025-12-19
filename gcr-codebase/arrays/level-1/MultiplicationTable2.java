// Program to print a multiplication table of a number entered by user from 6 to 9.

import java.util.Scanner;
public class MultiplicationTable2{
	public static void main (String[] args){
	  // Create a Scanner Object
      Scanner input = new Scanner(System.in);
	  
	  // Take number as input from user
	  System.out.println("Enter the number");
	  int number = input.nextInt();
	  
	  // Creating the array of size 
	  int array[] = new int[5];
	  
	  System.out.println(" Enter the 5 input numbers");
	  // Take input in an array using loop
	  for ( int i = 6 ; i <= 9 ; i++ ){
		  // Store the value of table in array
		  array[i] = number * i;
	  }
	  
	  // Printing the table
	  for ( int i = 6 ; i <= 9 ; i++ ){
		  System.out.println( number + " * " + i + " = " + array[i]);
	  }
	  
	  input.close();
	
	}
}
