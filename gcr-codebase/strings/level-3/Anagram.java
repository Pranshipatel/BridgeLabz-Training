// Program to check if two texts are anagrams and display the result

import java.util.Scanner;
public class Anagram{
	
	public static boolean isAnagram(String text1, String text2){
		int count[] = new int[256];
		
		if(text1.length() != text2.length()) return false;
		
		for(int i = 0;i < text1.length() ; i++){
			count[text1.charAt(i)]++;
			count[text2.charAt(i)]--;
		}
		
		for(int c : count){
			if ( c != 0 ) return false;
		}
		return true;
	}
	
	public static void main(String[] args){
	
	// Create a Scanner object
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter first text");
	String text1 = input.nextLine();
	
	System.out.println("Enter second text");
	String text2 = input.nextLine();
	
	boolean  result = isAnagram(text1, text2);
	
	System.out.println("is Anagram?" + result);
	
	}
}
	