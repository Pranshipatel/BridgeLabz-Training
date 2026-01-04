package com.encapsulationandpolymorphism.onlinedeliverysystem;

public class OrderProcessor {

    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        System.out.println(item.getDiscountDetails());
        System.out.println("Total Price: ₹" + item.calculateTotalPrice());
        System.out.println("--------------------------------");
    }
}
