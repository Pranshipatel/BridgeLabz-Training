package com.classandobject.level1;

public class Items {
	
	// Declaring the variables for listing the items
	String[] itemCode;
	String[] itemName;
	double[] price;
	
	// Constructor
	Items(String[]itemName ,String[] itemCode,double[] price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	public void displayItems(int i) {
		System.out.println("itemCode : "+itemCode[i]);
		System.out.println("itemPrice : "+price[i]);
		System.out.println("itemName : "+itemName[i]);
		System.out.println("----------------------------");
	}
	
	public static void main(String[] args) {
		String[] itemName= {"Bag","Rice","Pen"};
		String[] itemCode= {"0111","01BB","0200"};
		double[] price= {700,700,900};
		Items item1 = new Items(itemName, itemCode,price );
		
		for (int i = 0; i < price.length; i++) {
			item1.displayItems(i);
		}
		
	}
	
}
