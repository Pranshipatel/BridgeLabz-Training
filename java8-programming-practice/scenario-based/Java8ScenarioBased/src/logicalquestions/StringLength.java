package logicalquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLength {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("cat","elephant","dog");
		
		List<Integer> length = list.stream().map(String::length).collect(Collectors.toList());
		
		System.out.println(length);
		
	}

}
