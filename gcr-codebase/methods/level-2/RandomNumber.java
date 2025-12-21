// Program that generates five 4 digit random values

import java.util.Scanner;

public class RandomNumber{
	
	 public static void main(String[] args) {

        RandomStats obj = new RandomStats();

        // Generate array of 5 random 4-digit numbers
        int[] numbers = obj.generate4DigitRandomArray(5);

        // Print generated numbers
        System.out.println("Random Numbers: " + Arrays.toString(numbers));

        // Find average, min and max
        double[] result = obj.findAverageMinMax(numbers);

        // Find results
        System.out.println("Average = " + result[0]);
        System.out.println("Minimum = " + result[1]);
        System.out.println("Maximum = " + result[2]);
    }

    // Method to generate array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates numbers from 1000 to 9999
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }

        return arr;
    }

    // Method to find average, min and max of an array
    public double[] findAverageMinMax(int[] numbers) {

        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;

        return new double[]{average, min, max};
    }
	
}
		
		