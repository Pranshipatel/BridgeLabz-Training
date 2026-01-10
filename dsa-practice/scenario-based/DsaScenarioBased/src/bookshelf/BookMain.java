package bookshelf;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book("Stranger things", "Duffer brothers");
		BookShelf bookShelf = new BookShelf();
		
		System.out.println("====================Added Book=======================");
		bookShelf.addBook("Thriller", book);
		
		System.out.println("====================Borrowed Book====================");
		bookShelf.borrowBook("Thriller",book);
		
		System.out.println("====================Book Details=====================");
		bookShelf.displayCatalog();
		
		System.out.println("====================Return Book======================");
		bookShelf.returnBook("Thriller", book);
		
		System.out.println("====================Book Details=====================");
		bookShelf.displayCatalog();
		
	}
}
