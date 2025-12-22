// Program to split the text into words and find the shortest and longest strings in a given text

import java.util.Scanner;
import java.util.Arrays;


public class ShortestAndLargestString{
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
	
	// method to calculate length of string
	public static int lengthOfString(String word){
		int count  = 0;
		for(char c : word.toCharArray()){
			count++;
		}
	    return count;
	}
	
	// Method to create 2D array
	public static String[][] twoDString(String manualSplit[]){
		String twoD[][] = new String[manualSplit.length][2];
		for(int i = 0; i < twoD.length ; i++){
			String word = manualSplit[i];
			twoD[i][0] = word;
			twoD[i][1] = String.valueOf(lengthOfString(word));
		}
		return twoD;
	}
		

	public static void main(String[] args){
		
		  // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the text:");
        String text = input.nextLine();

        // User-defined split
        String[] manualSplit = splitTextManually(text);


        // Display results
        System.out.println("\nManual Split Result:");
        System.out.println(Arrays.toString(manualSplit));

        String twoD[][] = twoDString(manualSplit);
		
		System.out.println("\nCharacter\tType");
        System.out.println("-----------------------");

		// Print the 2D array
		for (int i = 0; i < twoD.length ; i++ ){
			System.out.println(twoD[i][0] + "\t\t" + twoD[i][1]);
	    }
        
        input.close();
		
	}
}