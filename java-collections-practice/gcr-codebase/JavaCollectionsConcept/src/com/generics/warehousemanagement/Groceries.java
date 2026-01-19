package com.generics.warehousemanagement;

public class Groceries extends WareHouseItem {

	public Groceries(String productName) {
		super(productName);
	}
	
	public void showDetails() {
		System.out.println("Product Name - > " + productName);
	}

}
