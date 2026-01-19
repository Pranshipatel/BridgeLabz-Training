package com.collections.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class NthElement {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		  list.add("A");
	      list.add("B");
	      list.add("C");
	      list.add("D");
	      list.add("E");


		int nth = 2;
		System.out.println("List -> " + list);
		findElement(list,nth);
	}

	static void findElement(LinkedList<String> list, int n) {
		if (list == null || n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        ListIterator<String> fast = list.listIterator();
        ListIterator<String> slow = list.listIterator();

       
        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                System.out.println("N is greater than list length");
                return;
            }
            fast.next();
        }

        
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        System.out.println("Nth element from end: " + slow.next());
    }
	
}


