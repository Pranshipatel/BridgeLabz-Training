package logicalquestions;

import java.util.Arrays;
import java.util.List;

public class StartingWithA {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana","ant","car");
		
		long count = list.stream().filter(e -> e.startsWith("a")).count();
		
		System.out.println(count);
	}

}
