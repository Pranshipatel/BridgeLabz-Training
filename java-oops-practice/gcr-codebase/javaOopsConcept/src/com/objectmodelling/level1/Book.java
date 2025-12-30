package com.objectmodelling.level1;

public class Book {
	String title;
	String author;
	
	
	// create a constructor
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public static void main(String[] args) {
		Book b1 = new Book("Java Programming", "Will");
		Book b2 = new Book("Python Programming", "Henry");
		
		Library l1 = new Library();
		Library l2 = new Library();
		
		System.out.println("Books in library 1");
		l1.addBooks(b1);
		System.out.println("Books in library 2");
		l2.addBooks(b2);
	}
   
}
