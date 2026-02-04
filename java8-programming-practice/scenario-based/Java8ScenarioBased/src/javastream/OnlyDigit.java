package javastream;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OnlyDigit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = input.nextLine();
		
		List<String> output = str.chars()
				.filter(e -> Character.isDigit(e))
				.mapToObj(e -> String.valueOf((char)e))
				.collect(Collectors.toList());
		
		output.forEach(System.out::print);
	}

}
