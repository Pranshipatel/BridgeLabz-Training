package com.constructor.level1;

public class BookLibrarySystem {
	 // public variable
    public String ISBN;

    // protected variable
    protected String title;

    // private variable
    private String author;

    // constructor
    BookLibrarySystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // getter for author
    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {

        EBook ebook = new EBook("978135166307","Effective Java", "Vecna", 5.2);

        ebook.displayEBookDetails();

        // update  private author using setter
        ebook.setAuthor("Eleven");

        System.out.println("\nAfter Author Update:");
        ebook.displayEBookDetails();
    }
}
