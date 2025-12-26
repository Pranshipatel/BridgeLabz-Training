// Program to remove all duplicate characters from a given string and return the modified string.

import java.util.Scanner;

public class RemoveDuplicates{
	
	//  method to remove duplicates
	public static String modifiedString(String text){
		String modified = "";
		
		for(int i = 0 ; i < text.length() ; i++){
			
			char current = text.charAt(i);
			boolean isDuplicate = false;
			
			for(int j= 0; j < modified.length(); j++){
				if(current == modified.charAt(j)){
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) modified += current;
		}
		
		return modified;
	}
	
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take string as user input
		System.out.println("Enter the text");
		String text = input.nextLine();
		
		String result = modifiedString(text);
		
		System.out.println("Modified String?? " + result);
		
	}
}