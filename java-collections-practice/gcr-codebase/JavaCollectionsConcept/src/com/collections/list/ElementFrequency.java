package com.collections.list;

import java.util.HashMap;
import java.util.LinkedList;

public class ElementFrequency {
	static void countFrequency(LinkedList<String> list) {
		HashMap<String, Integer> map = new HashMap<>();
		
	    for(String word : list) {
	    	map.put(word, map.getOrDefault(word, 0)+1);
	    }
		
		System.out.println("Counts of Element = " + map);
	}
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("apple");
		list.add("banana");
		list.add("apple");
		list.add("orange");
		
		System.out.println("List of Elements = " + list);
		countFrequency(list);
	}
 
}
