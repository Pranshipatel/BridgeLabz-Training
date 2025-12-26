// program that takes a sentence as input and returns the longest word in the sentence.

import java.util.Scanner;
import java.util.Arrays;

public class LongestWord{
	
	// method to find longest word
	public static String findLongestWord(String text){
		String word = "";
		int length = 0;
		String array[] = text.split(" ");
		System.out.println(Arrays.toString(array));
		for(int i = 0 ; i < array.length ; i++){
			if(length < array[i].length()){
				length = array[i].length();
				word = array[i];
			}
		}
		return word;
	}
		
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take string as user input
		System.out.println("Enter the text");
		String text = input.nextLine();
		
		//Get Longest word
		String word = findLongestWord(text);
		
		System.out.println("The longest word = " + word);
		
		input.close();
	}
}