package com.collections.set;

import java.util.HashSet;

public class SymmetricDifference {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		difference(set1,set2);
		
	}

	static void difference(HashSet<Integer> set1, HashSet<Integer> set2) {
		HashSet<Integer> difference = new HashSet<>(set1);

		for (int i : set2) {
			if (!difference.add(i)) {   
				difference.remove(i);   
		     }
		}
		
		System.out.println("Difference of two set -> " + difference);
	}

}
