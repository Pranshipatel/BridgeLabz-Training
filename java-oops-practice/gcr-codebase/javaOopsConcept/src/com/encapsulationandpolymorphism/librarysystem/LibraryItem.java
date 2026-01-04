package com.encapsulationandpolymorphism.librarysystem;

public abstract class LibraryItem implements Reservable {

    protected int itemId;
    protected String title;
    protected String author;

    private boolean isAvailable = true;
    private String borrowerName; // secured personal data

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Encapsulation
    protected void setBorrower(String name) {
        this.borrowerName = name;
        this.isAvailable = false;
    }

    protected void clearBorrower() {
        this.borrowerName = null;
        this.isAvailable = true;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            setBorrower(borrowerName);
            System.out.println("Item reserved by " + borrowerName);
        } else {
            System.out.println("Item not available");
        }
    }

    // Abstract method
    public abstract int getLoanDuration();
}
