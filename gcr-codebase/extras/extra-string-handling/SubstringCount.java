import java.util.Scanner;

public class SubstringCount {

    // Method to count substring occurrences
    public static int countOccurrences(String text, String sub) {
        int count = 0;

        for (int i = 0; i <= text.length() - sub.length(); i++) {
            if (text.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.println("Enter the main string:");
        String text = input.nextLine();

        System.out.println("Enter the substring:");
        String sub = input.nextLine();

        // Call method
        int result = countOccurrences(text, sub);

        // Display result
        System.out.println("Substring occurs " + result + " times.");
    }
}
