package com.encapsulationandpolymorphism.onlinedeliverysystem;

public class NonVegItem extends FoodItem {

    private final double nonVegCharge = 50;

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + nonVegCharge) * getQuantity();
        return total - (total * discount / 100);
    }
}
