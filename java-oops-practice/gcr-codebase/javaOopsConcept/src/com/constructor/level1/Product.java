package com.constructor.level1;

public class Product {
	// Attribute
	String productName;
	int price;
	static int totalProducts = 0;
	
	// Parameterized Constructor
	Product(String productName, int price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	void displayProductDetails() {
		System.out.println("Product Name : " + productName);
		System.out.println("Product Price : " + price);
		System.out.println("Total Product : " + totalProducts);
	}
	
	public static void main(String[] args) {
		Product p1 = new Product("Bottle", 40 );
		Product p2 = new Product("Bottle", 50 );
		
		p1.displayProductDetails();
		p2.displayProductDetails();
	}

}
