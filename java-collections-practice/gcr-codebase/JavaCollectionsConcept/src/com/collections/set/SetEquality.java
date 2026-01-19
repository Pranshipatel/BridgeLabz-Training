package com.collections.set;

import java.util.HashSet;

public class SetEquality {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(2);
		set2.add(1);
		
		System.out.println("Set 1 -> " + set1);
		System.out.println("Set 2 -> " + set2);
		
		check(set1, set2);
	}

	static void check(HashSet<Integer> set1, HashSet<Integer> set2) {
		 if (set1.equals(set2)) {
			 System.out.println("Both sets are equal");
		 } else {
		     System.out.println("Sets are not equal");
		 }

	}

}
