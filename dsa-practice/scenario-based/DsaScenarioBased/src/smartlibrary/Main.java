package smartlibrary;

public class Main {
	public static void main(String[] args) {
		Book b1 = new Book("The Alchemist", "Paulo Coelho", "Fiction");
		Book b2 = new Book("Atomic Habits", "James Clear", "Self-Help");
		Book b3 = new Book("Clean Code", "Robert C. Martin", "Programming");
		Book b4 = new Book("Harry Potter", "J.K. Rowling", "Fantasy");
		Book b5 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "Finance");
		Book b6 = new Book("The Hobbit", "J.R.R. Tolkien", "Adventure");
		Book b7 = new Book("1984", "George Orwell", "Dystopian");
		Book b8 = new Book("Think and Grow Rich", "Napoleon Hill", "Motivational");
		Book b9 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", "Biography");
		Book b10 = new Book("Introduction to Algorithms", "Thomas H. Cormen", "Education");

		SmartLibrary ss = new SmartLibrary();
		ss.addBook(b1);
		ss.addBook(b2);
		ss.addBook(b3);
		ss.addBook(b4);
		ss.addBook(b5);
		ss.addBook(b6);
		ss.addBook(b7);
		ss.addBook(b8);
		ss.addBook(b9);
		ss.addBook(b10);
		
		ss.sortBook();
		System.out.println();
		ss.displayBook();
	}
}
