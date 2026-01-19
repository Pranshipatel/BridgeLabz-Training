package com.collections.list;

import java.util.LinkedList;

public class ReverseList {
	static void reverseList(LinkedList<Integer> list) {
		if(list.size() <= 0) {
			System.out.println("List is empty");
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
		
		System.out.println("Reverse List -> " + list);
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(21);
		list.add(23);
		list.add(25);
		list.add(28);
		list.add(55);
		list.add(60);
		
		System.out.println("List -> " +list);
		reverseList(list);
	}

}
