// Program to check Pallindrome

import java.util.Scanner;

public class PalindromeCheck {

    // Method to take input
    public static String getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        return input.nextLine();
    }

    // Method to check palindrome
    public static boolean isPalindrome(String text) {
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        return text.equals(reverse);
    }

    // Method to display result
    public static void displayResult(boolean result) {
        if (result)
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string is not a palindrome");
    }

    public static void main(String[] args) {

        String text = getInput();
        boolean result = isPalindrome(text);
        displayResult(result);
		
    }
	
}
