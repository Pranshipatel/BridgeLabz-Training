// Program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method

import java.util.Scanner;

public class CharacterString{
	
	public static char[] userDefinedArray( String text ) {
		char firstArray[] = new char[text.length()];
		
		for( int i = 0; i < text.length() ; i++ ){
			firstArray[i] = text.charAt(i);
		}
		return firstArray;
	}
	
	public static char[] charArray( String text){
		char secondArray[] = text.toCharArray();
		return secondArray;
	}
	
	public static boolean compareArray( char firstArray[] , char secondArray[]){
		for( int i = 0 ; i < firstArray.length ; i++ ){
			if ( firstArray[i] != secondArray[i] ){
				return false;
			}
		}
		return true;
	}
		
	
	public static void main (String[] args){
		
		CharacterString compare = new CharacterString();
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Taking String as input
		System.out.println("Enter the string: ");
		String text = input.nextLine();
		
		char firstArray[] = compare.userDefinedArray(text);
		
		char secondArray[] = compare.charArray(text);
		
		boolean result = compare.compareArray(firstArray , secondArray);
		
		// Pring the result
		System.out.println("Two arrays are equal? " + result);
		
		input.close();
		
	}
}	
