// Program to save odd and even numbers into odd and even arrays

import java.util.Scanner;
import java.util.Arrays;

public class EvenAndOddNumber{
	public static void main (String[] args){
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Taking integer input from the user
		System.out.println("Enter the nummber");
		int number = input.nextInt();
		
		// creating size of array
		int size = (number / 2) + 1;
		
		// Creating array for even numbers
		int evenNumber[] = new int[size];
		// creating array for odd numbers
		int oddNumber[] = new int[size];
		
		// Store the even number in array
		int k = 0;
		for(int i = 1 ; i <= number ; i++){
			if ( i % 2 == 0 ){
				evenNumber[k] = i ;
				k++;
			}
		}
		
		// Store the odd numbers in array
		int j = 0;
		for(int i = 1 ; i <= number ; i++){
			if ( i % 2 != 0 ){
				oddNumber[j] = i ;
				j++;
			}
		}
		
		System.out.println("Even numbers are = " + Arrays.toString(evenNumber));
		System.out.println("Odd numbers are = " + Arrays.toString(oddNumber));
		
		input.close();
		
	}
}
		