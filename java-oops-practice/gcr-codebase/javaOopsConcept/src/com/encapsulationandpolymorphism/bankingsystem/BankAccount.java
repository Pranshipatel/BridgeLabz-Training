package com.encapsulationandpolymorphism.bankingsystem;

public abstract class BankAccount {

    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Encapsulation
    public double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }

    // Abstract method
    public abstract double calculateInterest();
}
