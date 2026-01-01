package com.inheritance.multilevel.ordermanagement;

public class OrderTest {
    public static void main(String[] args) {
        DeliveredOrder d1 =
            new DeliveredOrder(51, "24-06-2025", 4555, "29-06-2025");

        System.out.println("-------------Display Delivery Details----------");
        d1.getOrderStatus();
    }
}
