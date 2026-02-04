package logicalquestions;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,25,3,99,45);
		
		int maxNo = list.stream().max(Integer::compare).get();
		
		System.out.println("Max Number is : " + maxNo);
	}

}
