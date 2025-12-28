package com.constructor.level1;

public class BankAccount {

    // public variable
    public String accountNumber;

    // protected variable
    protected String accountHolder;

    // private variable
    private double balance;

    // constructor
    BankAccount(String accountNumber, String accountHolder, double balance) {
    	
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }

    // deposit money
    public void deposit(double amount) {
        if (amount > 0) {
        	
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // withdraw money
    public void withdraw(double amount) {
    	
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount");
        }
        
    }
    
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SB10123", "Pranshi", 50000, 4.5);

        sa.displayAccountDetails();

        sa.deposit(10000);
        sa.withdraw(8000);

        System.out.println("\nAfter Transactions:");
        sa.displayAccountDetails();
    }
}
