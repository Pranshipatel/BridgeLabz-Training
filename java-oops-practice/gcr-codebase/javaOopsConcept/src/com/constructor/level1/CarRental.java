package com.constructor.level1;

class CarRental {

    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;
    double totalCost;

    
    // Default constructor
    CarRental() {
        this.customerName = "Customer";
        this.carModel = "Hatchback";
        this.rentalDays = 1;
        this.costPerDay = 1000;
        calculateTotalCost();
    }

    
    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
        calculateTotalCost();
    }

    // Method to calculate total cost
    void calculateTotalCost() {
        totalCost = rentalDays * costPerDay;
    }

    // Method to display rental details
    void displayRental() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model    : " + carModel);
        System.out.println("Rental Days  : " + rentalDays);
        System.out.println("Total Cost   : ₹" + totalCost);
        System.out.println("---------------------------");
    }
    

    public static void main(String[] args) {

        // Using default constructor
        CarRental r1 = new CarRental();

        // Using parameterized constructor
        CarRental r2 = new CarRental("Pranshi", "Sedan", 4, 2500);

        r1.displayRental();
        r2.displayRental();
    }
    
}

