import java.util.Scanner;

public class Collinear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for 3 points
        System.out.println("Enter x1 y1:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter x2 y2:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter x3 y3:");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // slope
        int slope1 = (y2 - y1) * (x3 - x2);
        int slope2 = (y3 - y2) * (x2 - x1);

        if (slope1 == slope2) {
            System.out.println("Collinear using slope method");
        } else {
            System.out.println("Not collinear using slope method");
        }

        // area
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);

        if (area == 0) {
            System.out.println("Collinear using area method");
        } else {
            System.out.println("Not collinear using area method");
        }

        sc.close();
    }
}
