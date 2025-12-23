import java.util.inputanner;

public class CharacterFrequency {

    // Method to find character frequency
    public static char[][] findFrequency(String text) {

        int freq[] = new int[256]; 

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
		

        // Count unique characters
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                count++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; 
            }
        }
		

        // Create 2D array to store character and frequency
        char result[][] = new char[count][2];
        int index = 0;
		

        // Reset and store values
        freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] > 0) {
                result[index][0] = ch;
                result[index][1] = (char)(freq[ch] + '0'); 
                index++;
                freq[ch] = 0;
            }
        }
		

        return result;
    }
	
	

    public static void main(String[] args) {

        inputanner input = new inputanner(System.in);

        System.out.println("Enter a string:");
        String text = input.nextLine();

        char[][] result = findFrequency(text);

        System.out.println("Character  Frequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "          " + (result[i][1] - '0'));
        }

        input.close();
    }
}
