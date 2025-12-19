// Program to calculate percentage and grade using 2D array

import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.println("Enter number of students:");
        int n = input.nextInt();

        // 2D array to store marks
        int[][] marks = new int[n][3];

        // Array to store percentage
        double[] percentage = new double[n];

        // Array to store grade
        char[] grade = new char[n];

        // Take marks input
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            // Physics marks
            System.out.println("Enter Physics marks:");
            marks[i][0] = input.nextInt();
            if (marks[i][0] < 0) {
                System.out.println("Enter positive marks");
                i--;
                continue;
            }

            // Chemistry marks
            System.out.println("Enter Chemistry marks:");
            marks[i][1] = input.nextInt();
            if (marks[i][1] < 0) {
                System.out.println("Enter positive marks");
                i--;
                continue;
            }

            // Maths marks
            System.out.println("Enter Maths marks:");
            marks[i][2] = input.nextInt();
            if (marks[i][2] < 0) {
                System.out.println("Enter positive marks");
                i--;
                continue;
            }

            // Calculate percentage using 2D array
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Calculate grade
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Print result
        System.out.println("Phy  Chem  Maths  Percentage  Grade");

        for (int i = 0; i < n; i++) {
            System.out.println(
                marks[i][0] + "   " +
                marks[i][1] + "    " +
                marks[i][2] + "     " +
                percentage[i] + "        " +
                grade[i]
            );
        }

        input.close();
    }
}
