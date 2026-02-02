package com.lambda.customsorting;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
	            new Product("Laptop", 55000, 4.5, 10),
	            new Product("Mobile", 20000, 4.7, 15),
	            new Product("Headphones", 3000, 4.2, 25)
	    );
		
		// Sort by Price
		products.sort((p1,p2) -> Double.compare(p1.price, p2.price));
		System.out.println("Sorted Products on the basis of price");
		products.forEach(p -> System.out.println(p));
		
		// Sort by rate
		products.sort((p1,p2) -> Double.compare(p1.rate, p2.rate));
		System.out.println("Sorted Products on the basis of rate");
		products.forEach(p -> System.out.println(p));
		
		// Sort by Discount
		products.sort((p1,p2) -> Double.compare(p1.discount, p2.discount));
		System.out.println("Sorted Products on the basis of discount");
		products.forEach(p -> System.out.println(p));
		
	}
	
	
}
