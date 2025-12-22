// Program to find factors of a number and perform operations using factors array

import java.util.Arrays;
import java.util.Scanner;

public class FactorOperations {
	
	 // Method to find factors of a number
    public static int[] findFactors(int number) {

        int count = 0;

        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

       
        int[] factorsArray = new int[count];
        int index = 0;

        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsArray[index] = i;
                index++;
            }
        }
		
        return factorsArray;
		
    }
	

    // Method to find greatest factor
    public static int findGreatestFactor(int[] factorsArray) {
		
        int greatest = factorsArray[0];

        for (int factor : factorsArray) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
		
        return greatest;
		
    }
	

    // Method to find sum of factors
    public static int findSumOfFactors(int[] factorsArray) {
		
        int sum = 0;

        for (int factor : factorsArray) {
            sum = sum + factor;
        }
		
        return sum;
		
    }


    // Method to find product of factors
    public static long findProductOfFactors(int[] factorsArray) {
		
        long product = 1;

        for (int factor : factorsArray) {
            product = product * factor;
        }
        return product;
		
    }
	

    // Method to find product of cubes of factors
    public static double findProductOfCubesOfFactors(int[] factorsArray) {
		
        double product = 1;

        for (int factor : factorsArray) {
            product = product * Math.pow(factor, 3);
        }
        return product;
		
    }
	

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find factors
        int[] factorsArray = findFactors(number);
        System.out.println("Factors of " + number + " are: " +
                Arrays.toString(factorsArray));

        // Greatest factor
        int greatestFactor = findGreatestFactor(factorsArray);
        System.out.println("Greatest factor = " + greatestFactor);
		

        // Sum of factors
        int sumOfFactors = findSumOfFactors(factorsArray);
        System.out.println("Sum of factors = " + sumOfFactors);
		

        // Product of factors
        long productOfFactors = findProductOfFactors(factorsArray);
        System.out.println("Product of factors = " + productOfFactors);
		

        // Product of cubes of factors
        double productOfCubes = findProductOfCubesOfFactors(factorsArray);
        System.out.println("Product of cubes of factors = " + productOfCubes);

        input.close();
    }

   
}
