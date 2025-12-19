// Program FizzBuzz

import java.util.Scanner;
import java.util.Arrays;

public class FizzBuzz{
	public static void main (String[] args){
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		// Creating array to store the values
		String array[] = new String[number+1];
		
		// Using loop to store the values in array
		for (int i = 0; i <= number ; i++){
			
			if( i % 3 == 0 && i % 5 != 0 ){
				
				array[i] = "Fizz" ;
				
			} else if ( i % 5 == 0 && i % 3 != 0 ){
				
				array[i] = "Buzz" ;
				
			} else if ( i % 3 == 0 && i % 5 == 0 ){
				
				array[i] = "FizzBuzz";
				
			} else {
				
				array[i] = Integer.toString(i);
			
			}
		}
		
		// Print the array
		System.out.println("The elements in array are : " + Arrays.toString(array));
		
		input.close();
		
	}
}
			
