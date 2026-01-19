package com.collections.set;

import java.util.HashSet;

public class UnionAndIntersection {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		unionSet(set1,set2);
		intersection(set1,set2);
	}

    static void intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
    	 HashSet<Integer> intersection = new HashSet<>();

    	    for (int i : set1) {
    	        if (set2.contains(i)) {
    	            intersection.add(i);
    	        }
    	    }

		
		System.out.println("Intersection of both set -> " + intersection);
		
	}

	static void unionSet(HashSet<Integer> set1, HashSet<Integer> set2) {
		HashSet<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println("union of both set -> " + union);
		
	}

}
