package com.objectmodelling.level1;

public class BankAccount {
	
    private Bank bank;
    private BankCustomer customer;
    private double balance;

    public BankAccount(Bank bank, BankCustomer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
    
}
