package com.collections.list;

import java.util.LinkedList;

public class RotateElement {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(21);
		list.add(23);
		list.add(25);
		list.add(55);
		list.add(60);
		int k = 2;
		
		System.out.println("List -> " +list);
		rotateElement(list,k);
	}

    static void rotateElement(LinkedList<Integer> list, int k) {
		if(list.size() < 0) {
			System.out.println("List is empty");
			return;
		}
		
		// Handle Large rotation
		k = k % list.size();
		
		for(int i = 0 ; i < k ; i++) {
			int last = list.removeLast();
			list.addFirst(last);
		}
		
		System.out.println("Rotated list -> " + list);
		
	}

}
