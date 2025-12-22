// Simple program to check Perfect, Abundant, Deficient and Strong numbers

import java.util.Scanner;

public class NumberChecker4 {
	
	 // Check perfect number
    public static boolean checkPerfect(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum == number;
    }

    // Check abundant number
    public static boolean checkAbundant(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum > number;
    }

    // Check deficient number
    public static boolean checkDeficient(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum < number;
    }

    // Check strong number
    public static boolean checkStrong(int number) {

        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + factorial(digit);
            temp = temp / 10;
        }
        return sum == number;
    }

    // Method to find factorial of a digit
    public static int factorial(int digit) {

        int fact = 1;

        for (int i = 1; i <= digit; i++) {
            fact = fact * i;
        }
        return fact;
    }
	

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Print Perfect Number, Adundant Number, Deficient Number, Strong Number
        System.out.println("Number = " + number);

        System.out.println("Perfect Number? " + checkPerfect(number));
        System.out.println("Abundant Number? " + checkAbundant(number));
        System.out.println("Deficient Number? " + checkDeficient(number));
        System.out.println("Strong Number? " + checkStrong(number));

        input.close();
    }

   
}
