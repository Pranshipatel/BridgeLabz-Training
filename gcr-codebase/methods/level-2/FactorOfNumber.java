// Program to find the factors of a number taken as user input, store the factors in an array


import java.util.Scanner;
import java.util.Arrays;

public class FactorOfNumber{
	
	// calculate the factor of number 
	public static int[] calculateFactor( int number ){
		
		int count = 0;
		for(int i = 1; i <= number ; i++){
			if ( number % i == 0){
				count++ ;
			}
		}
		
		int array[] = new int[count + 1];
		int index = 0;
		for(int i = 1; i <= number ; i++){
			if ( number % i == 0){
				array[index] = i ;
				index++;
			}
		}
		
		return array;
		
	}
	
	// Calculate the sum of factor
	public static int sumFactor( int array[] ){
		
		int sum = 0;
		
		for(int i = 0; i < array.length ; i++ ){
			sum += array[i];
		}
		
		return sum;
	}
	
	// calculate the product of factor
	public static int productFactor( int array[] ){
		
		int factor = 1;
		
		for(int i = 0; i < array.length ; i++ ){
			factor = factor * array[i];
		}
		
		return factor;
		
	}
	
	// calculate the sum of product of factor
	public static int sumOfSquares( int array[] ){
		
		int sumSquare = 0;
		
		for(int i = 0; i < array.length ; i++ ){
			sumSquare += array[i] * array[i] ;
		}
		
		return sumSquare;
		
	}
	
	
	public static void main (String[] args){
		
		FactorOfNumber factorOfNumber = new FactorOfNumber();
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Take number as input
		System.out.println("Enter the number 1 : ");
		int number = input.nextInt();
		
		
		// Get the array of factor
		int arrayFactor[] = factorOfNumber.calculateFactor(number);
		
		
		
		// Get the sum of factors of number
		int sumOfFactor = factorOfNumber.sumFactor(arrayFactor);
		
		// Print the sum of factors of number
		System.out.println("Sum of factors = " + sumOfFactor);
		
		
		
		
		// Get the product of factors of number
		int productOfFactor = factorOfNumber.productFactor(arrayFactor);
		
		// Print the product of factors of number
		System.out.println("product of factors = " + productOfFactor);
		
		
		
		// Get the sum od Square of factors of number
		int sumOfSquareOfFactor = factorOfNumber.sumOfSquares(arrayFactor);
		
		// Print the sum of factors of number
		System.out.println("Sum of Square of factors = " + sumOfSquareOfFactor);
		
		
		input.close();
	
	}
}