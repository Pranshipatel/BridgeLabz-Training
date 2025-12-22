import java.util.Scanner;

public class DistanceAndLine {

    // Method to find Euclidean distance
    public static double findDistance(int x1, int y1, int x2, int y2) {

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2)
        );

        return distance;
    }

    // Method to find slope (m) and y-intercept (b)
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {

        double m = (double)(y2 - y1) / (x2 - x1);  
        double b = y1 - m * x1;                  

        double result[] = { m, b };
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for first point
        System.out.println("Enter x1 y1:");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        // Take input for second point
        System.out.println("Enter x2 y2:");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        // Calculate distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        // Calculate line equation
        double line[] = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);

        input.close();
    }
}
