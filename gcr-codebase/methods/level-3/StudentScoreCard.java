import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random PCM marks
    public static int[][] generateMarks(int students) {

        int marks[][] = new int[students][3]; 

        for (int i = 0; i < students; i++) {
            marks[i][0] = 10 + (int)(Math.random() * 90); 
            marks[i][1] = 10 + (int)(Math.random() * 90); 
            marks[i][2] = 10 + (int)(Math.random() * 90); 
        }
        return marks;
    }


    // Method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] marks) {

        int students = marks.length;
        double result[][] = new double[students][3]; 

        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
		
        return result;
    }
	
	

    // Method to find grade
    public static String findGrade(double percentage) {

        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }


    // Method to display scorecard
    public static void displayScoreCard(int[][] marks, double[][] result) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < marks.length; i++) {

            String grade = findGrade(result[i][2]);

            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "\t" +
                grade
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int students = sc.nextInt();

        int marks[][] = generateMarks(students);
        double results[][] = calculateResults(marks);

        displayScoreCard(marks, results);

        sc.close();
    }
}
