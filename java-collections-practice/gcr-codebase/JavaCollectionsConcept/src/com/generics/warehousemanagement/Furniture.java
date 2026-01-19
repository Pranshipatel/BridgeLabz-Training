package com.generics.warehousemanagement;

public class Furniture extends WareHouseItem {

	public Furniture(String productName) {
		super(productName);
	}
   
	public void showDetails() {
		System.out.println("Product Name - > " + productName);
	}
}
