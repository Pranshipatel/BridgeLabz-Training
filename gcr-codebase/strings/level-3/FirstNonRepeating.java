import java.util.inputanner;

public class 
 {

    // Method to find first non-repeating character
    public static char findFirstNonRepeating(String text) {

        int freq[] = new int[256]; 

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // if no non-repeating character
    }

    public static void main(String[] args) {

        inputanner input = new inputanner(System.in);

        System.out.println("Enter a string:");
        String text = input.nextLine();

        char result = findFirstNonRepeating(text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }

        input.close();
    }
}
