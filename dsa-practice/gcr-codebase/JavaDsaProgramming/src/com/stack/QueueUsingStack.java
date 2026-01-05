package com.stack;
import java.util.Stack;

public class QueueUsingStack {
	
	private Stack<Integer> stackEnq;
	private Stack<Integer> stackDeq;
	
	// Constructor
	public QueueUsingStack() {
		stackEnq = new Stack<>();
		stackDeq = new Stack<>();
	}
	
	// Enqueue Operation
	public void enqueue(int data) {
		stackEnq.push(data);
		System.out.println("Enqueued data = " + data);
	}
	
	// Dequeue Operation
	public int dequeue() {
		if(stackEnq.isEmpty() && stackDeq.isEmpty()) {
			return -1;
		}
		
		if(stackDeq.isEmpty()) {
			while(!stackEnq.isEmpty()) {
				stackDeq.push(stackEnq.pop());
			}
		}
		
		return stackDeq.pop();
	}
	
	// Peek From element
	public int peek() {
		if(stackEnq.isEmpty() && stackDeq.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		
		if(stackDeq.isEmpty()) {
			while(!stackEnq.isEmpty()) {
				stackDeq.push(stackEnq.pop());
			}
		}
		
		return stackDeq.peek();
		
	}
	
	// Check if queue is empty
	 public boolean isEmpty() {
	     return stackEnq.isEmpty() && stackDeq.isEmpty();
	 }
	 
	 // Main method for testing
	 public static void main(String[] args) {

	     QueueUsingStack queue = new QueueUsingStack();

	     queue.enqueue(10);
	     queue.enqueue(20);
	     queue.enqueue(30);

	     System.out.println("Dequeued: " + queue.dequeue());
	     System.out.println("Front element: " + queue.peek());

	     queue.enqueue(40);

	     while (!queue.isEmpty()) {
	         System.out.println("Dequeued: " + queue.dequeue());
	     }
	 }

}
