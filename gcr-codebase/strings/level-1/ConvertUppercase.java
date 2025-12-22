// Program to convert the complete text to lowercase and compare the results

import java.util.Scanner;

public class ConvertUppercase{
	
	public static String convertCase(String text){
		String store = "";
		for(int i = 0 ; i < text.length() ; i++ ){
			if(Character.isUpperCase(text.charAt(i))){
				store += text.charAt(i);
			} else {
				store += (char)(text.charAt(i) - 32);
			}
		}
		
		return store;
	}
	
	public static String convertCase2(String text){
		return text.toUpperCase();
	}
	
	public static void main (String[] args){
		
		// create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Take text as input from user
		System.out.println("Enter the text");
		String text = input.nextLine();
		
		String  result1 = convertCase(text);
		
		String result2 = convertCase2(text);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		System.out.println("result1 is equal to result2 ? " + result1.equals(result2));
		
		input.close();
		
	}
}
