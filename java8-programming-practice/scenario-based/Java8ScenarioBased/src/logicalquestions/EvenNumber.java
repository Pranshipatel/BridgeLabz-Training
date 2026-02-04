package logicalquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,5,7,8,10,13);
		
		
		List<Integer> even = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		even.forEach(System.out::print);
		System.out.print(even);
		
		
	}

}
