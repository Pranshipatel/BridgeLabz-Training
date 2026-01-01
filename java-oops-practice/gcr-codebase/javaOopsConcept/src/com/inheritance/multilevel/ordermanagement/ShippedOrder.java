package com.inheritance.multilevel.ordermanagement;

class ShippedOrder extends Order {
	protected int trackingNumber;
	
	public ShippedOrder(int orderId, String orderDate, int trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	
	void getOrderStatus() {
		System.out.println("Order id = " + orderId);
		System.out.println("Order Date = " + orderDate);
		System.out.println("Tracking Number = " + trackingNumber );
	}

}
