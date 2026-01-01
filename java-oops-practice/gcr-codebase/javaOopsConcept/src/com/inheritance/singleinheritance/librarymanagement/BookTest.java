package com.inheritance.singleinheritance.librarymanagement;

public class BookTest {
	
	public static void main(String[] args) {
		Author a1 = new Author("Stranger things", 2025, "Duffer Brothers", "Vecna" );
		
		System.out.println("--------Book Details---------");
		
		a1.displayInfo();	
	}

}
