package com.collections.set;

import java.util.HashSet;
import java.util.LinkedList;

public class SortedList {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		
		set.add(5);
		set.add(3);
		set.add(9);
		set.add(1);
		
		LinkedList<Integer> list = new LinkedList<>(set);
		sortedList(list);
	}

	static void sortedList(LinkedList<Integer> list) {
		if(list.size() < 0) {
			System.out.println("Set is Empty");
			return;
		}
		
		int start = 0;
		int end = list.size()-1;
		while(start < end) {
			int temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);
			start++;
			end--;
		}
		
		System.out.println("Sorted Set -> " + list);
	}

	
}
