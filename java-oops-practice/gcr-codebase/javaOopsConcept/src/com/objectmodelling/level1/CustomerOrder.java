package com.objectmodelling.level1;

import java.util.ArrayList;

public class CustomerOrder {
    private int orderId;
    private ArrayList<CustomerProduct> products;

    public CustomerOrder(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public void addProduct(CustomerProduct product) {
        products.add(product);
        System.out.println(product.getProductName() + " added to Order " + orderId);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        for (CustomerProduct p : products) {
            System.out.println("- " + p.getProductName());
        }
    }
}
