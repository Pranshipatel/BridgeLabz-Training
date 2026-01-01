package com.inheritance.singleinheritance.librarymanagement;

class Author extends Book {
	private String name;
	private String bio;
	

	public Author(String title, int publicationYear, String name, String bio) {
		super(title,publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	void displayInfo() {
		System.out.println("Title of Book = " + title);
		System.out.println("Publication Year of Book = " + publicationYear);
		System.out.println("Name of book = " + name);
		System.out.println("Bio of book = " + bio);
	}

}
