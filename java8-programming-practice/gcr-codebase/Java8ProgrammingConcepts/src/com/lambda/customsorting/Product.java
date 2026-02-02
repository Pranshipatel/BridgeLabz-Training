package com.lambda.customsorting;

public class Product {
	String name;
	double price;
	double rate;
	double discount;
	
	public Product(String name, double price, double rate, double discount) {
		this.name = name;
		this.price = price;
		this.rate = rate;
		this.discount = discount;
	}
	
	public String toString() {
		return name + "/nrupees = " + price + "/ndiscount = " + discount + "/rate = " + rate;
	}

}
