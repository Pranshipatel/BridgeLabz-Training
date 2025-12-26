// Program to count the number of vowels and consonants in a given string.

import java.util.Scanner;
public class VowelAndConsonant{
	
	public static int[] vowelAndConsonantCount(String text){
		int vowel = 0;
		int consonant = 0;
		
		for(int i = 0; i < text.length(); i++){
			char c = Character.toLowerCase(text.charAt(i));
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				vowel++;
			} else consonant++;
		}
		
		return new int[] {vowel, consonant};
	}
	
	public static void main(String[] args){
		String text = "ThisisTheEndOfWorld";
		
		int count[] = vowelAndConsonantCount(text);
		
		// Print vowel and consonant count
		System.out.println("Vowel = " + count[0] + "\n Consonant = " + count[1]);
	
	}
}