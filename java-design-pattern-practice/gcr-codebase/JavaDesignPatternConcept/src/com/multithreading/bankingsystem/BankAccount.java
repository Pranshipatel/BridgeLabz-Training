package com.multithreading.bankingsystem;

import java.time.LocalDateTime;

class BankAccount {

    private int balance = 10000;

    // synchronized to avoid race condition
    public synchronized boolean withdraw(String customerName, int amount) {

        System.out.println("[" + customerName + "] Attempting to withdraw " + amount);

        if (balance >= amount) {
            try {
                Thread.sleep(300); // simulate processing time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            balance -= amount;

            System.out.println("[" + customerName + "] Withdrawal SUCCESS | Amount: "
                    + amount + " | Time: " + LocalDateTime.now());
            System.out.println("Remaining Balance: " + balance);
            return true;
        } else {
            System.out.println("[" + customerName + "] Withdrawal FAILED | Insufficient Balance | Time: "
                    + LocalDateTime.now());
            return false;
        }
    }
}