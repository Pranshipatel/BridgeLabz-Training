// Program to calculate BMI using 2D array

import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of persons
        System.out.println("Enter number of persons:");
        int number = input.nextInt();

        // 2D array to store weight, height and BMI
        double[][] personData = new double[number][3];

        // Array to store weight status
        String[] weightStatus = new String[number];

        // Take input for each person
        for (int i = 0; i < number; i++) {

            System.out.println("Person " + (i + 1));

            // Take weight (positive value only)
            System.out.println("Enter weight:");
            personData[i][0] = input.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.println("Enter positive weight:");
                personData[i][0] = input.nextDouble();
            }

            // Take height (positive value only)
            System.out.println("Enter height:");
            personData[i][1] = input.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.println("Enter positive height:");
                personData[i][1] = input.nextDouble();
            }

            // Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Find weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Print result
        System.out.println("Height  Weight  BMI  Status");

        for (int i = 0; i < number; i++) {
            System.out.println(
                personData[i][1] + "   " +
                personData[i][0] + "   " +
                personData[i][2] + "   " +
                weightStatus[i]
            );
        }

        input.close();
    }
}
