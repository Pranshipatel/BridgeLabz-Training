// Program to calculate BMI of multiple persons

import java.util.Scanner;

public class BMI{
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number of persons
        System.out.println("Enter number of persons:");
        int n = input.nextInt();

        // Create arrays to store values
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Take weight and height input
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));

            System.out.println("Enter weight:");
            weight[i] = input.nextDouble();

            System.out.println("Enter height:");
            height[i] = input.nextDouble();
        }

        // Calculate BMI and weight status
        for (int i = 0; i < n; i++) {

            // BMI formula
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Find weight status
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Print details of each person
        System.out.println("Height  Weight  BMI  Status of person is");

        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + "   " + weight[i] + "   " + bmi[i] + "   " + status[i]);
        }

        input.close();
    }
}
