package javastream;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = input.nextLine();
		
		Map<String , Long> frequency = Arrays.stream(str.toLowerCase()
				.split("\\W+"))
				.filter( c -> !c.isEmpty())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		System.out.println(frequency);

	}

}
