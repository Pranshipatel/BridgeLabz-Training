import java.util.Scanner;

public class LexicographicalCompare {

    public static void compareStrings(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 < c2) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
                return;
            } else if (c1 > c2) {
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
                return;
            }
        }

        // If all characters are same till min length
        if (s1.length() < s2.length()) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        } else if (s1.length() > s2.length()) {
            System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String 1:");
        String str1 = input.nextLine();

        System.out.println("Enter String 2:");
        String str2 = input.nextLine();

        compareStrings(str1, str2);
    }
}
