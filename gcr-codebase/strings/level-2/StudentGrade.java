import java.util.Scanner;

public class StudentGrade {

    // Method to generate random marks
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            marks[i][0] = (int)(Math.random() * 90) + 10; // Physics
            marks[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
            marks[i][2] = (int)(Math.random() * 90) + 10; // Math
        }
        return marks;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculate(int[][] marks) {
        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100) / 100.0;
            result[i][2] = Math.round(percent * 100) / 100.0;
        }
        return result;
    }

    // Method to find grade
    public static String[] findGrade(double[][] result) {
        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double p = result[i][2];

            if (p >= 80) grade[i] = "A";
            else if (p >= 70) grade[i] = "B";
            else if (p >= 60) grade[i] = "C";
            else if (p >= 50) grade[i] = "D";
            else if (p >= 40) grade[i] = "E";
            else grade[i] = "R";
        }
        return grade;
    }

    // Method to display result
    public static void display(int[][] marks, double[][] result, String[] grade) {

        System.out.println("\nStu  Phy  Chem  Math  Total  Avg   %    Grade");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                (i + 1) + "    " +
                marks[i][0] + "   " +
                marks[i][1] + "    " +
                marks[i][2] + "    " +
                (int)result[i][0] + "   " +
                result[i][1] + "  " +
                result[i][2] + "  " +
                grade[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] result = calculate(marks);
        String[] grade = findGrade(result);

        display(marks, result, grade);

        sc.close();
    }
}
