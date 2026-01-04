package com.encapsulationandpolymorphism.onlinedeliverysystem;

public class VegItem extends FoodItem {

    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }
}
