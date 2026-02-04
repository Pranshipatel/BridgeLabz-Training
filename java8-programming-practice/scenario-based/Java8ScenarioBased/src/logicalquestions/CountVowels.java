package logicalquestions;

import java.util.Scanner;
import java.util.stream.Collectors;

public class CountVowels {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = input.nextLine();
		
		long count = str.toLowerCase().chars()
				.filter(c -> "aeiou".indexOf(c) != -1).count();
				
		System.out.print(count);
		
	}

}
