// Program to take user input for the age of all 10 students in a class

import java.util.Scanner;

public class VoteEligibility{
	public static void main (String[] args){
	  // Create a Scanner Object
      Scanner input = new Scanner(System.in);
	  
	  // Creating the array of size 10
	  int array[] = new int[10];
	  
	  System.out.println(" Enter the age of 10 Students ");
	  // Take student age as input in an array using loop
	  for ( int i = 0 ; i < array.length ; i++ ){
		  // Store student age in array
		  array[i] = input.nextInt();
		  
	  }
	  
	  // check whether the student can vote or not
	  for(int i = 0 ; i < array.length ; i++) {
		  
		  // check if student can vote or not
		  if( array[i] < 18 && array[i] >= 1 ){
			  System.out.println("Student " + i + " is not eligible to vote" );
		  }else if ( array[i] >= 18 ){
			  System.out.println("Student " + i + " is eligible to vote" );
		  } else {
			  System.out.println("Student " + i + " age is Invalid" );
		  }
		  
	  }
	  
	  input.close();
	  
	}
}
	  
	  

	  

		