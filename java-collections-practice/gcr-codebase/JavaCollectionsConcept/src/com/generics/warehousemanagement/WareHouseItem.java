package com.generics.warehousemanagement;

public abstract class WareHouseItem {
	
	protected String productName;

	public WareHouseItem(String productName) {
		this.productName = productName;
	}
	
	public abstract void showDetails();

}

