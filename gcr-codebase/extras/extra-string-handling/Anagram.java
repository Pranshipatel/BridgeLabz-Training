// a Java program that accepts two strings from the user and checks if the two
//strings are anagrams

import java.util.Scanner;
public class Anagram{
	
	// method to check anagram
	public static boolean checkAnagram(String text1, String text2){
		int count[] = new int[256];
		
		for(int i = 0; i < text1.length() ; i++){
			count[text1.charAt(i)]++;
			count[text2.charAt(i)]--;
		}
		
	    for(int c : count){
			if ( c != 0)return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args){
		// Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.println("Enter the first string:");
        String text1 = input.nextLine();
		
		System.out.println("Enter the second string:");
        String text2 = input.nextLine();
		
		boolean result = checkAnagram(text1, text2);
		
		System.out.println("Is Anagram?? " + result);
		
		input.close();
		
	}
}