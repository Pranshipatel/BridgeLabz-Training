// Java program to toggle the case of each character in a given string. Convert
//uppercase letters to lowercase and vice versa.


import java.util.Scanner;

public class ToggleCase{
	
	public static String changeCase(String text){
		String word = "";
		for(int i = 0; i < text.length(); i++ ){
			char c = text.charAt(i);
			if(Character.isLowerCase(c)){
				word += Character.toUpperCase(c);
			} else word += Character.toLowerCase(c);
		}
		return word;
	}
	
	public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.println("Enter the main string:");
        String text = input.nextLine();

        // Call method
        String result = changeCase(text);

        // Display result
        System.out.println("Toggled String =  " + result );
    }
}