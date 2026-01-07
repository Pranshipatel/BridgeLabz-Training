// Remove Duplicate using String Builder and HashSet
package com.searching;
import java.util.HashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str = "pranshiiiiii";
		HashSet<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for(char c : str.toCharArray()) {
			if(!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
			
		}
		
		System.out.println(sb.toString());
	}

}
