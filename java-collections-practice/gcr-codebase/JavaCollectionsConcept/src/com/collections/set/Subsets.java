package com.collections.set;

import java.util.HashSet;

public class Subsets {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(1);
		set2.add(2);
		set2.add(4);
		set2.add(5);
		
		subsets(set1,set2);
	}

	static void subsets(HashSet<Integer> set1, HashSet<Integer> set2) {
		boolean is = set2.containsAll(set1);
		System.out.println("Subset -> " + is);
	}

}
