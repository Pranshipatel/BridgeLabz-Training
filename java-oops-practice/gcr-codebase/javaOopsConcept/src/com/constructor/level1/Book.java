//Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.

package com.constructor.level1;

public class Book {
	
	String title;
	String author;
	int price;
	
	// Default Constructor
	Book(){
		title = "Normal People";
		author = "Sally Rooney";
		price = 190;
	}
	
	// Parameterized Constructor
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// Display out put
	void displayBookDetails() {
		System.out.println("Title of book is : " + title);
		System.out.println("Author of book is : " + author);
		System.out.println("Price of book is : " + price);
	}
	
	// main method
	public static void main(String[] args) {
		// Details of book 1
		System.out.println("Book 1 : ");
		Book b1 = new Book();
		b1.displayBookDetails();
		
		// Details of Book 2
		System.out.println("Book 2 : ");
		Book b2 = new Book("The Alchemist" , "Paulo Coelho", 239);
		b2.displayBookDetails();
		
	}
	
    
}
