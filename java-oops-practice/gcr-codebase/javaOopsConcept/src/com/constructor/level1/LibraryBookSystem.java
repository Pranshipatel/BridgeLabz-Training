package com.constructor.level1;

public class LibraryBookSystem {
	
	//Attributes
	String title;
	String author;
	int price;
	boolean availability;
	
	// Parameterized Constructor
	LibraryBookSystem(String title, String author, int price, boolean availability){
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	
	void borrowBook() {
		if(availability) {
			availability = false;
			System.out.println("You have Successfully borrowed this book : " + title);
		} else {
			System.out.println("Sorry this book is not available");
		}
	}
	
	void displayBookSystem() {
		System.out.println("Title of book is : " + title);
		System.out.println("Author of book is : " + author);
		System.out.println("Price of book is : " + price);
		System.out.println("Availability " + (availability ? "This book is available" : "This Book is not available"));
	}
	
	public static void main(String[] args) {
		LibraryBookSystem lb = new LibraryBookSystem("The Alchemist" , "Paulo Coelho" , 259 , true);
		
		lb.displayBookSystem();
	}

}
