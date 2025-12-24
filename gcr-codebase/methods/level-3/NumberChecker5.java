import java.util.Scanner;

public class NumberChecker5 {

    // Method to count digits
    public static int countDigits(int number) {
		
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
		
        return count;
    }

    // Method to store digits in array
    public static int[] storeDigits(int number) {
		
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
		
    }
	

    // Method to find sum of digits using array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
		
        return sum;
		
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
		
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
		
    }

    // Method to check Harshad number
    public static boolean isHarshad(int number, int[] digits) {
		
        int sum = sumOfDigits(digits);
        return number % sum == 0;
		
    }

    // Method to find frequency of digits (2D array)
    public static int[][] digitFrequency(int[] digits) {
		
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;   
            freq[i][1] = 0;   
        }

        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
		
    }

    // Method to display frequency table
    public static void displayFrequency(int[][] freq) {
		
        System.out.println("Digit  Frequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println(freq[i][0] + "      " + freq[i][1]);
            }
        }
		
    }

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);
        displayFrequency(freq);

        input.close();
    }
}
