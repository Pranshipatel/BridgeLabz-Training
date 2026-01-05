package com.stack;

import java.util.Stack;

public class SortStackRecursion {
	
	// Function to sort the stack
	public static void sortStack(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		}
		
		int top = stack.pop();
		
		sortStack(stack);
		
		insertSorted(stack, top);
		
	}
	
	// Funtion to insert element in sorted order
	public static void insertSorted(Stack<Integer> stack, int value) {
		if(stack.isEmpty() || stack.peek() <= value) {
		stack.push(value);
		return;
		}
		
		int temp = stack.pop();
		
		insertSorted(stack, value);
		
		stack.push(temp);
		
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		stack.push(30);
	     stack.push(10);
	     stack.push(20);
	     stack.push(5);

	     System.out.println("Original Stack: " + stack);

	     sortStack(stack);

	     System.out.println("Sorted Stack (Ascending): " + stack);
	}
}
