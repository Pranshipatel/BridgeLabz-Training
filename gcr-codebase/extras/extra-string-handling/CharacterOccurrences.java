// program to remove all occurrences of a specific character from a string.

import java.util.Scanner;
public class CharacterOccurrences{
	
	public static String modifiedString(String text1, char text2){
		String modified = "";
		for(int i = 0; i < text1.length(); i++){
			if(text1.charAt(i) == text2) continue;
			else modified += text1.charAt(i);
		}
		return modified;
	}
	
	public static void main(String[] args){
		// Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.println("Enter the first string:");
        String text1 = input.nextLine();
		
		System.out.println("Enter the string to remove:");
        char text2 = input.next().charAt(0);
		
		String result = modifiedString(text1, text2);
		
		System.out.println("Is Anagram?? " + result);
		
		input.close();
	}
}