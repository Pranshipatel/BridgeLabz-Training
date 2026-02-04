package logicalquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		int sum = list.stream().mapToInt(Integer :: intValue).sum();
		
		System.out.print("Sum of numbers : " + sum);
	}

}
