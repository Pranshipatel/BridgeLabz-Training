// Program to perform basic maths operation
import java.util.inputanner;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        inputanner input = new inputanner(System.in);

        System.out.println("Enter first number:");
        int a = input.nextInt();

        System.out.println("Enter second number:");
        int b = input.nextInt();

        System.out.println("Choose operation");
        System.out.println("1 Add");
        System.out.println("2 Subtract");
        System.out.println("3 Multiply");
        System.out.println("4 Divide");

        int choice = input.nextInt();

        if (choice == 1)
            System.out.println("Result = " + add(a, b));
        else if (choice == 2)
            System.out.println("Result = " + subtract(a, b));
        else if (choice == 3)
            System.out.println("Result = " + multiply(a, b));
        else if (choice == 4)
            System.out.println("Result = " + divide(a, b));
        else
            System.out.println("Invalid choice");

        input.close();
    }
}
