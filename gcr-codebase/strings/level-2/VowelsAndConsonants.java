// Program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string

import java.util.Scanner;
import java.util.Arrays;

public class VowelsAndConsonants{
	
	public static String convertCase(String text){
		String store = "";
		for(int i = 0 ; i < text.length() ; i++ ){
			if(Character.isLowerCase(text.charAt(i))){
				store += text.charAt(i);
			} else {
				store += (char)(text.charAt(i) + 32);
			}
		}
		
		return store;
	}
	
	public static int[] countVowelsAndConsonants(String lowercaseText){
		int vowel = 0;
		int consonants = 0;
		int array[] = new int [2] ;
		for(int i = 0; i < lowercaseText.length() ; i++ ){
			if(lowercaseText.charAt(i) == 'a' || lowercaseText.charAt(i) == 'e' || lowercaseText.charAt(i) == 'i'
			|| lowercaseText.charAt(i) == 'o' || lowercaseText.charAt(i) == 'u') vowel++;
			else consonants++;
		}
		
		return new int[] {vowel, consonants};
	}
	
	
	public static void main(String[] args){
		
		String text = "thisIsTheEndOfWorld";
		
		String lowercaseText = convertCase(text);
		System.out.println(lowercaseText);
		
		int counts[] = countVowelsAndConsonants(lowercaseText);
		
		System.out.println("Vowels and consonants counts = " + Arrays.toString(counts));
		
	}
	
	
}
		
		