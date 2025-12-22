import java.util.Scanner;
import java.util.Arrays;

public class WordCompare2 {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // end of string reached
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitTextManually(String text) {

        int length = findLength(text);

        // Step 1: Count words
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (text.charAt(i) == ' ') {
                inWord = false;
            }
        }

        // Step 2: Store words
        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                word = word + text.charAt(i);
            } else if (!word.equals("")) {
                words[index++] = word;
                word = "";
            }
        }

        // Add last word
        if (!word.equals("")) {
            words[index] = word;
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the text:");
        String text = input.nextLine();

        // User-defined split
        String[] manualSplit = splitTextManually(text);

        // Built-in split
        String[] builtInSplit = text.split(" ");

        // Display results
        System.out.println("\nManual Split Result:");
        System.out.println(Arrays.toString(manualSplit));

        System.out.println("\nBuilt-in split() Result:");
        System.out.println(Arrays.toString(builtInSplit));

        // Compare results
        boolean result = compareArrays(manualSplit, builtInSplit);
        System.out.println("\nAre both results same? " + result);

        input.close();
    }
}
