package com.objectmodelling.level1;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<CustomerOrder> orders;

    public Customer(String customerName) {
        this.customerName = customerName;
        orders = new ArrayList<>();
    }

    // Communication method
    public void placeOrder(CustomerOrder order) {
        orders.add(order);
        System.out.println(customerName + " placed an order.");
    }

    public String getCustomerName() {
        return customerName;
    }
}
