// Program to find the factors of a number taken as user input, store the factors in an array, and display the factors

import java.util.Scanner;
import java.util.Arrays;

public class FactorOfNumber{
	public static void main (String[] args){
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Initial array size
		int maxFactor = 10;
		int factorArray[] = new int[maxFactor];
		int index = 0;
		
		// Taking number as input
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		
		// Find factors
		for(int i = 1; i <= number ; i++){
			
			if ( number % i == 0 ){
				
				 // Resize array if full
				if ( index == maxFactor ){
					
					int maxIndex = index * 2;
					int temporaryArray[] = new int[maxIndex];
					
					// Copy old values
					for ( int j = 0 ; j < factorArray.length ; j++){
						temporaryArray[j] = factorArray[j];
					}
					
					// resizing factorArray
					factorArray = temporaryArray;
					
				}
				
				factorArray[index] = i;
				index++;
			}
			
		}
		
		// Print the factors of number
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factorArray[i] + " ");
        }
		
		input.close();
	}
}
		