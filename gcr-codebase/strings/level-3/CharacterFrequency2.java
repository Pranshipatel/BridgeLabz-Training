import java.util.Scanner;

public class CharacterFrequency2 {

    // Method to find character frequencies
    public static String[] findFrequency(String text) {

        // Convert string to character array
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // loop to calculate frequency
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;   

            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; 
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Store result in String array
        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " = " + freq[i];
                index++;
            }
        }

        return result;
    }

    
    public static void main(String[] args) {

        // create Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter the text:");
        String text = input.nextLine();


        String[] frequency = findFrequency(text);
		
        // Print result
        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i]);
        }

        input.close();
    }
}
