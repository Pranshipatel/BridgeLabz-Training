package logicalquestions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CountWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = input.nextLine();
		
		long count = Arrays.stream(str.trim().split("\\s+")).count();
		
		System.out.print(count);
	}

}
