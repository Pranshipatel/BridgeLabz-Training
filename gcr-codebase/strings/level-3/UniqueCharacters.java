import java.util.inputanner;

public class UniqueCharacters {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    // Method to find unique characters
    public static char[] findUnique(String text) {

        int len = findLength(text);
        char temp[] = new char[len];
        int index = 0;

        
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

           
            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index] = ch;
                index++;
            }
        }

        // Create final array of exact size
        char result[] = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }



    public static void main(String[] args) {

        inputanner input = new inputanner(System.in);

        System.out.println("Enter a string:");
        String text = input.nextLine();

        char unique[] = findUnique(text);

        System.out.println("Unique characters are:");
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }

        input.close();
    }
	
}
