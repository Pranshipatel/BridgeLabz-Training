package com.inheritance.multilevel.ordermanagement;

public class Order {
	int orderId ;
	String orderDate;
	
	public Order(int orderId, String orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	void getOrderStatus() {
		System.out.println("Order id = " + orderId);
		System.out.println("Order Date = " + orderDate);
	}

}
