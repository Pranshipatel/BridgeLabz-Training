package com.objectmodelling.level1;
import java.util.List;
import java.util.ArrayList;


public class Library {
	private List<Book> books;
	
	public Library() {
		this.books =  new ArrayList<>();
	}
	
	public void addBooks(Book book) {
		books.add(book);
		System.out.println("Book " + book.getTitle() + " is added of author " + book.getAuthor() );
	}
	
	public void showAllBook() {
		for(Book book : books) {
			System.out.println(book.getTitle());
		}
	}
   
}
