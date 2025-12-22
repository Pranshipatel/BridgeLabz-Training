//program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method

import java.util.Scanner;
import java.util.Arrays;

public class WordCompare{
	
	public static String[] convertToWord1(String text){
		String word[] = new String[text.length()] ;
		for(int i = 0; i < word.length ; i++){
            word[i] = String.valueOf(text.charAt(i));
		}
		return word;
	}
	
	public static String[] convertToWord2(String text){
		String word[] = text.split("");
		if (word.length > 0 && word[0].equals("")) {
             word = Arrays.copyOfRange(word, 1, word.length);
        }
		return word;
	}
	
	public static boolean compare(String word1[] , String word2[]){
		if ( word1.length != word2.length) return false;
		
	    for(int i =0; i < word1.length ; i++){
			if (!word1[i].equals(word2[i])) return false;
		}
		return true;
	}
	
	public static void main (String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take text as user input
		System.out.println("Enter the text");
		String text = input.nextLine();
		
		// Get text into words
		String word1[] = convertToWord1(text);
		
		String word2[] = convertToWord2(text);
		
		System.out.println("word1 = " + Arrays.toString(word1));
		
		System.out.println("word2 = " + Arrays.toString(word2));
		
		boolean result = compare(word1, word2);
		
		System.out.println("Two arrays are equal = " + result);
		
		input.close();
		
	}
}

		