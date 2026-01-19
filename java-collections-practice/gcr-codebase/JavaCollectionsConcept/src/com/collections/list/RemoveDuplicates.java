package com.collections.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicates {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(21);
		list.add(21);
		list.add(23);
		list.add(25);
		list.add(23);
		list.add(55);
		list.add(21);
		list.add(60);
		
		System.out.println("List -> " +list);
		removeDuplicate(list);
	}

    static void removeDuplicate(LinkedList<Integer> list) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		
		list.clear();
		list.addAll(set);
		System.out.println("After Removing Duplicates -> " + set);
		
	}

}
