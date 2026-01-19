package com.collections.list;

import java.util.ArrayList;

public class ReverseArrayList {
	
	static void reverseList(ArrayList<Integer> list) {
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
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(23);
		list.add(25);
		list.add(28);
		list.add(55);
		list.add(60);
		
		System.out.println("List -> " +list);
		reverseList(list);
	}

}
