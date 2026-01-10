package foodloop;

import java.util.ArrayList;
import java.util.List;

class Order implements IOrderable {
    private List<FoodItem> items;
    private double totalPrice;

    // Constructor for custom combo meals
    public Order(List<FoodItem> items) {
        this.items = items;
        calculateTotal();
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (FoodItem item : items) {
            if (item.isAvailable()) {
                totalPrice += item.getPrice();
                item.reduceStock();
            }
        }
        totalPrice -= applyDiscount(); 
    }

    // Polymorphism: Discount varies by total
    public double applyDiscount() {
        if (totalPrice >= 1000) {
            return totalPrice * 0.20;
        } else if (totalPrice >= 500) {
            return totalPrice * 0.10;
        }
        return 0;
    }

    @Override
    public void placeOrder() {
        System.out.println("Order placed successfully!");
        System.out.println("Total amount to pay: ₹" + totalPrice);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order has been cancelled.");
    }
}
