// Program to perform various number checking operations

import java.util.Arrays;

public class NumberChecker {
	

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
	
	

    // Method to check if number is a Duck Number
    public static boolean isDuckNumber(int[] digitsArray) {
		
        for (int digit : digitsArray) {
            if (digit != 0) {
                return true;
            }
        }
		
        return false;
    }
	
	

    // Method to check if number is an Armstrong Number
    public static boolean isArmstrongNumber(int[] digitsArray) {
		
        int numberOfDigits = digitsArray.length;
        int sum = 0;

        for (int digit : digitsArray) {
            sum += Math.pow(digit, numberOfDigits);
        }

        int originalNumber = 0;
        for (int digit : digitsArray) {
            originalNumber = originalNumber * 10 + digit;
        }

        return sum == originalNumber;
		
    }
	
	

    // Method to find largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digitsArray) {
		
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digitsArray) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
		
        return new int[]{largest, secondLargest};
    }
	
	

    // Method to find smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digitsArray) {
		
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digitsArray) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
		
        return new int[]{smallest, secondSmallest};
    }
	
	

    public static void main(String[] args) {

        int number = 153;

        // Count number of digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits = " + digitCount);
		

        // Store digits in array
        int[] digitsArray = storeDigitsInArray(number);
        System.out.println("Digits array = " + Arrays.toString(digitsArray));
		

        // Check duck number
        System.out.println("Is Duck Number = " + isDuckNumber(digitsArray));
		
		

        // Check armstrong number
        System.out.println("Is Armstrong Number = " + isArmstrongNumber(digitsArray));
		
		

        // Find largest and second largest digits in number
        int[] largestDigits = findLargestAndSecondLargest(digitsArray);
        System.out.println("Largest number = " + largestDigits[0]);
        System.out.println("Second largest number = " + largestDigits[1]);


        // Find smallest and second smallest number
        int[] smallestDigits = findSmallestAndSecondSmallest(digitsArray);
        System.out.println("Smallest number = " + smallestDigits[0]);
        System.out.println("Second smallest number = " + smallestDigits[1]);
		
		
    }
	
	
}
