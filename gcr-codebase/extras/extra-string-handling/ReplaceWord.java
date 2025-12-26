import java.util.Scanner;

public class ReplaceWord {

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        
		String result = "";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result += newWord;
            } else {
                result += words[i];
            }

            
            if (i < words.length - 1) {
                result += " ";
            }
        }
        return result;
		
    }

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Take sentence as user input
        System.out.println("Enter the sentence:");
        String sentence = input.nextLine();

        // Take word as user input
        System.out.println("Enter the word to replace:");
        String oldWord = input.nextLine();

        // Take new word as user input
        System.out.println("Enter the new word:");
        String newWord = input.nextLine();

        // Call replace method
        String output = replaceWord(sentence, oldWord, newWord);

        // Print the  result
        System.out.println("Updated sentence:");
        System.out.println(output);
    }
}
