package com.generics.warehousemanagement;

public class Electronics extends WareHouseItem{

	public Electronics(String productName) {
		super(productName);
	}
	
	public void showDetails() {
		System.out.println("Product Name - > " + productName);
	}

}
