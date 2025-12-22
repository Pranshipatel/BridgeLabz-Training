// Simple program to check different number types


import java.util.Scanner;

public class NumberChecker3 {
	
	 // Check prime number
    public static boolean checkPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Check neon number
    public static boolean checkNeon(int number) {

        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum = sum + (square % 10);
            square = square / 10;
        }
        return sum == number;
		
    }

    // Check spy number
    public static boolean checkSpy(int number) {

        int sum = 0;
        int product = 1;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;
        }
        return sum == product;
		
    }

    // Check automorphic number
    public static boolean checkAutomorphic(int number) {

        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp = temp / 10;
            square = square / 10;
        }
        return true;
		
    }

    // Check buzz number
    public static boolean checkBuzz(int number) {

        if (number % 7 == 0 || number % 10 == 7) {
            return true;
        }
		
        return false;
		
    }
	

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Number = " + number);

        System.out.println("Prime Number? " + checkPrime(number));
        System.out.println("Neon Number? " + checkNeon(number));
        System.out.println("Spy Number? " + checkSpy(number));
        System.out.println("Automorphic Number? " + checkAutomorphic(number));
        System.out.println("Buzz Number? " + checkBuzz(number));

       
        input.close();
    }

   
}
