package com.encapsulationandpolymorphism.librarysystem;

public class LibraryAppTest {
    public static void main(String[] args) {

        LibraryItem item1 = new Book(1, "Java Programming", "James");
        LibraryItem item2 = new Magazine(2, "Tech Today", "Editorial Team");
        LibraryItem item3 = new DVD(3, "Inception", "Christopher Nolan");

        item1.getItemDetails();
        System.out.println("Loan Duration: " + item1.getLoanDuration());

        item2.reserveItem("Pranshi");
        item3.reserveItem("Amit");

        System.out.println("DVD Available: " + item3.checkAvailability());
    }
}
