//Program to trim the leading and trailing spaces from a string using the charAt() method 

import java.util.Scanner;

public class TrimStringUsingCharAt {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input string
        System.out.println("Enter the text:");
        String text = input.nextLine();

        // Get trim indexes using user-defined method
        int[] indexes = findTrimIndexes(text);

        String userTrimmed = createSubstring(text, indexes[0], indexes[1]);

        // Trim using built-in method
        String builtInTrimmed = text.trim();

        // Compare both results
        boolean isSame = compareStrings(userTrimmed, builtInTrimmed);

        // Println results
        System.out.println("User Defined Trim Result : [" + userTrimmed + "]");
        System.out.println("Built-in Trim Result     : [" + builtInTrimmed + "]");
        System.out.println("Are both strings equal?  : " + isSame);

        input.close();
    }
}
