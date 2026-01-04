package com.encapsulationandpolymorphism.onlinedeliverysystem;

public class FoodDeliveryAppTest {
    public static void main(String[] args) {

        FoodItem item1 = new VegItem("Paneer Burger", 120, 2);
        FoodItem item2 = new NonVegItem("Chicken Pizza", 250, 1);

        item1.applyDiscount(10);
        item2.applyDiscount(5);

        OrderProcessor.processOrder(item1);
        OrderProcessor.processOrder(item2);
    }
}
