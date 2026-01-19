package com.generics.warehousemanagement;

import java.util.List;

public class Main {
	public static void displayProducts(List<? extends WareHouseItem> products) {

		// Loop through products and display details
		for (WareHouseItem p : products) {
			p.showDetails();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("---------------------Electronics-------------------");
		Storage<Electronics> electronics = new Storage<>();
		electronics.addProduct(new Electronics("Cooler"));
		electronics.addProduct(new Electronics("Lights"));
		
		displayProducts(electronics.getProduct());
		
		System.out.println("---------------------Furniture--------------------");
		Storage<Furniture> furniture = new Storage<>();
		furniture.addProduct(new Furniture("Sofa"));
		furniture.addProduct(new Furniture("Bed"));
		furniture.addProduct(new Furniture("Chairs"));
		
		displayProducts(furniture.getProduct());
		
		System.out.println("---------------------Groceries--------------------");
		Storage<Groceries> groceries = new Storage<>();
		groceries.addProduct(new Groceries("Rice"));
		groceries.addProduct(new Groceries("Eggs"));
		groceries.addProduct(new Groceries("Oil"));
		
		displayProducts(groceries.getProduct());

	}

}
