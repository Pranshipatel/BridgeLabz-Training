package logicalquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyString {
	public static void main(String[] args) {
		List<String> list  = Arrays.asList("java","","spring","","boot");
		
		List<String> empty = list.stream().filter(e -> e.length() > 0).collect(Collectors.toList());
		
	    System.out.print(empty);
		
	}

}
