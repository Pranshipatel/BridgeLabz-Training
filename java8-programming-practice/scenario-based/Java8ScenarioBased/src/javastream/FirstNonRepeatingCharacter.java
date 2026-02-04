package javastream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = input.nextLine();
		
		String output = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(
						Function.identity() , 
						LinkedHashMap :: new , 
						Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() == 1)
				.map(e -> e.getKey())
				.findFirst()
				.get();
		
		System.out.println(output);
	}

}
