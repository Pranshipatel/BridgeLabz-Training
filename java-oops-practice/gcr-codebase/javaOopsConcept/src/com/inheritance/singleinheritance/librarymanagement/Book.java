package com.inheritance.singleinheritance.librarymanagement;

public class Book {
	String title;
	int publicationYear;
	
	public Book(String title, int publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}
	
	void displayInfo() {
		System.out.println("Title of Book = " + title);
		System.out.println("Publication Year of Book " + publicationYear);
	}

}
