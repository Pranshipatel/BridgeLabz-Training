package com.objectmodelling.level1;

public class CustomerMain {
	public static void main(String[] args) {

        Customer customer = new Customer("Pranshi");

        CustomerProduct p1 = new CustomerProduct("Laptop");
        CustomerProduct p2 = new CustomerProduct("Mouse");

        CustomerOrder order1 = new CustomerOrder(101);

        customer.placeOrder(order1);

        order1.addProduct(p1);
        order1.addProduct(p2);

        System.out.println();
        order1.showOrderDetails();
    }

}
