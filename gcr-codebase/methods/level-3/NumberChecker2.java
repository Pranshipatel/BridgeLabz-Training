// Program to perform number checking operations

import java.util.Arrays;

public class NumberChecker2 {
	
	
    // Method to count digits in a number
    public static int countDigits(int number) {
		
        int count = 0;

        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
		
    }

    // Method to store digits of number in an array
    public static int[] storeDigitsInArray(int number) {
		
        int digitCount = countDigits(number);
        int[] digitsArray = new int[digitCount];

        int index = digitCount - 1;
        while (number != 0) {
            digitsArray[index] = number % 10;
            number = number / 10;
            index--;
        }
        return digitsArray;
		
    }

    // Method to reverse digits array
    public static int[] reverseDigitsArray(int[] digitsArray) {
		
        int[] reversedArray = new int[digitsArray.length];

        for (int i = 0; i < digitsArray.length; i++) {
            reversedArray[i] = digitsArray[digitsArray.length - 1 - i];
        }
        return reversedArray;
		
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] firstArray, int[] secondArray) {

        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
		
    }

    // Method to check if number is a Palindrome
    public static boolean isPalindromeNumber(int[] digitsArray) {
		
        int[] reversedArray = reverseDigitsArray(digitsArray);
        return areArraysEqual(digitsArray, reversedArray);
    }
	

    // Method to check if number is a Duck Number
    public static boolean isDuckNumber(int[] digitsArray) {
		
        for (int digit : digitsArray) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
	
	

    public static void main(String[] args) {

        int number = 12021;

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Digit count = " + digitCount);
		

        // Store digits in array
        int[] digitsArray = storeDigitsInArray(number);
        System.out.println("Digits array = " + Arrays.toString(digitsArray));
		

        // Reverse digits array
        int[] reversedDigitsArray = reverseDigitsArray(digitsArray);
        System.out.println("Reversed digits array = " + Arrays.toString(reversedDigitsArray));
		

        // Compare original and reversed array
        System.out.println("Are both arrays equal = " +
                areArraysEqual(digitsArray, reversedDigitsArray));

        // Palindrome check
        System.out.println("Is Palindrome Number = " +
                isPalindromeNumber(digitsArray));

        // Duck number check
        System.out.println("Is Duck Number = " +
                isDuckNumber(digitsArray));
				
    }

}
