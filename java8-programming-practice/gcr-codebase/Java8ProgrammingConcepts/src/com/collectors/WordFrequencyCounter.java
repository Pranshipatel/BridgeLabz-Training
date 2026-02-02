package com.collectors;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		String paragraph =
                "Java streams make Java code concise and Java streams are powerful";

		Map<String, Integer> map = Arrays.stream(paragraph.toLowerCase().split("\\s+"))
				.collect(Collectors.toMap(word -> word, word -> 1, Integer :: sum));
		
		map.forEach((word, count)->{
			System.out.println(word + " -> " + count);
		});
		
		
		
	}

}
