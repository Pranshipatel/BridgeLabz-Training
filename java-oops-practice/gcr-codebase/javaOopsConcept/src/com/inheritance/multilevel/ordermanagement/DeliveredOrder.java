package com.inheritance.multilevel.ordermanagement;

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate,
                          int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        System.out.println("Order ID = " + orderId);
        System.out.println("Order Date = " + orderDate);
        System.out.println("Tracking Number = " + trackingNumber);
        System.out.println("Delivery Date = " + deliveryDate);
    }
}
