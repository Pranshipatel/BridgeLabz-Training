import java.util.Scanner;

public class PalindromeCheck {

    
    // Compare characters using start and end index (loop)
    public static boolean isPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
		
        return true;
    }

    
    // Recursive palindrome check
    public static boolean isPalindromeRecursive(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

      
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    
    // Reverse string using charAt() and compare arrays
    public static char[] reverseText(String text) {
        char[] reverse = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index] = text.charAt(i);
            index++;
        }
		
		
        return reverse;
    }

    public static boolean isPalindromeArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseText(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
		
        return true;
    }

   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the text:");
        String text = input.nextLine();

        // Logic 1 
        System.out.println("Logic 1 (Loop): " + isPalindromeLoop(text));

        // Logic 2
        System.out.println("Logic 2 (Recursion): " +
                isPalindromeRecursive(text, 0, text.length() - 1));

        // Logic 3
        System.out.println("Logic 3 (Char Array): " + isPalindromeArray(text));

        input.close();
    }
}
