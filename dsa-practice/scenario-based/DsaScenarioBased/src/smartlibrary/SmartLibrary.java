package smartlibrary;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SmartLibrary {
	ArrayList<Book> shelf = new ArrayList<>();
	
	void addBook(Book b) {
		shelf.add(b);
		System.out.println(b.title + " book is added whose author is " + b.author);
	}
	
	void sortBook() {
		for(int i = 1 ; i < shelf.size() ; i++) {
			Book key = shelf.get(i);
			int prev = i - 1;
			
			while(prev >= 0 && shelf.get(prev).title.compareToIgnoreCase(key.title) > 0) {
				shelf.set(prev+1, shelf.get(prev));
				prev--;
			}
			
			shelf.set(prev+1, key);
		}
	}
	
	void displayBook() {
		System.out.println("-----------------------------Library Books--------------------------");
		for(int i = 0 ; i < shelf.size(); i++) {
			System.out.println("Book's Title = " + shelf.get(i).title);
			System.out.println("Book's Author = " + shelf.get(i).author);
			System.out.println("Book's genre = " + shelf.get(i).genre);
			System.out.println("------------------------------------------------------------");
		}
	}

}
