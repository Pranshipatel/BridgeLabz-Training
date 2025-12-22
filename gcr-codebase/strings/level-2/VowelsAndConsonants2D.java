// Program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string

import java.util.Scanner;
import java.util.Arrays;

public class VowelsAndConsonants2D{
	
	public static String checkCharType(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if letter
        if (ch >= 'a' && ch <= 'z') {

            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }

        } else {
            return "Not a Letter";
        }
    }

	
	 // Method to create 2D array (Character, Type)
    public static String[][] findVowelsAndConsonants(String text) {

        String result[][] = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }

        return result;
    }

	// Method to show 2D array 
    public static void displayTable(String[][] data) {

        System.out.println("\nCharacter\tType");
        System.out.println("-----------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
		
    }

	
	public static void main(String[] args){
		
		String text = "thisIsTheEndOfWorld";
		
		String result[][] = findVowelsAndConsonants(text);

        displayTable(result);

	}
	
}
		
		