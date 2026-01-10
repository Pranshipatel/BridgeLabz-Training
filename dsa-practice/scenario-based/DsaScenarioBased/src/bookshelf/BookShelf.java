package bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class BookShelf {
    Map<String, LinkedList<Book>> catlog = new HashMap<>();
	
	HashSet<Book> uniqueBooks = new HashSet<>();
	
	public void addBook(String genre, Book book) {
		if(uniqueBooks.contains(book)) {
			System.out.println("Duplicate Book");
			return;
		}
		catlog.putIfAbsent(genre,new LinkedList<>()) ;
	    catlog.get(genre).add(book);
	    uniqueBooks.add(book);
	    System.out.println("Bood Added : " + book.getTitle() + "\nFrom author : " + book.getAuthor());
		
	}
	
	public void borrowBook(String genre, Book book) {
		LinkedList<Book> books = catlog.get(genre);
		
		if(books != null && books.remove(book)) {
			uniqueBooks.remove(book);
			System.out.println("Borrowed Book : " + book.getTitle());
		}
		else {
			System.out.println("Book not available");
		}
	}
	
	public void returnBook(String genre, Book book) {
		addBook(genre,book);
	}
	
	public void displayCatalog() {
		for (String genre : catlog.keySet()) {
			
			System.out.println("Genre: " + genre);
			
	        for (Book book : catlog.get(genre)) {
	        	System.out.println("Title of book : " + book.getTitle() + "\n Author : " + book.getAuthor());
	         
	        }    
		}    
	 }


}
