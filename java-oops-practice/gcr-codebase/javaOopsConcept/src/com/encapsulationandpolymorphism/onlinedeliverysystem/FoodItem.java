package com.encapsulationandpolymorphism.onlinedeliverysystem;

public abstract class FoodItem implements Discountable {

    protected String itemName;
    private double price;
    private int quantity;
    protected double discount;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation
    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Base Price: ₹" + price);
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    @Override
    public void applyDiscount(double percentage) {
        discount = percentage;
    }

    @Override
    public String getDiscountDetails() {
        return discount > 0 ? discount + "% discount applied" : "No discount applied";
    }
}
