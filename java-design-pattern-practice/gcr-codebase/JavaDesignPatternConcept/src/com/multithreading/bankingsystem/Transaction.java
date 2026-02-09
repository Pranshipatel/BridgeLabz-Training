package com.multithreading.bankingsystem;

class Transaction implements Runnable {

    private BankAccount account;
    private int amount;
    private String customerName;

    public Transaction(BankAccount account, String customerName, int amount) {
        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(customerName, amount);
    }
}