// Program to find frequency of characters in a string using unique characters
import java.util.Scanner;

public class UniqueCharactersFrequency {

    // Method to find unique characters using charAt() and nested loops
    public static char[] findUniqueCharacters(String text) {

        int length = text.length();
        char[] tempArray = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check whether character appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create array of exact size
        char[] uniqueCharacters = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueCharacters[i] = tempArray[i];
        }

        return uniqueCharacters;
    }

    // Method to find frequency of characters using ASCII array and unique characters
    public static String[][] findCharacterFrequency(String text) {

        int[] frequency = new int[256]; // ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Get unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Create 2D array to store character and frequency
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    // Method to display the result
    public static void display(String[][] data) {

        System.out.println("Character\tFrequency");

        for (int i = 0; i < data.length; i++) {
            System.out.println("\t" + data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Find frequency using unique characters
        String[][] result = UniqueCharactersFrequency.findCharacterFrequency(text);

        // Display result
        display(result);

        sc.close();
    }
}