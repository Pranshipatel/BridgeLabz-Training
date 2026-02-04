package logicalquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","api");
		
		List<String> reverse = list.stream().map(str -> new StringBuilder(str).reverse().toString()).collect(Collectors.toList());
		
		System.out.print(reverse);
	}

}
