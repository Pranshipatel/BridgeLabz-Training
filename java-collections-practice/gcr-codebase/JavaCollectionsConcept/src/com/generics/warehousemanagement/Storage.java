package com.generics.warehousemanagement;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WareHouseItem> {
	
	private List<T> products = new ArrayList<>();
	
	public void addProduct(T product)  {
		products.add(product);
	}
	
	public List<T> getProduct(){
		return products;
	}
      
}
