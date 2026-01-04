package ewalletapplication;

import java.util.ArrayList;
import java.util.List;

public abstract class Wallet implements Transferrable {
    private double balance;
    protected List<Transaction> transactions = new ArrayList<>();

    public Wallet(double initialBalance, boolean referral) {
        this.balance = initialBalance;
        if (referral) {
            this.balance += 50; // referral bonus
        }
    }

    public double getBalance() {
        return balance;
    }

    protected void addMoney(double amount) {
        balance += amount;
    }

    protected boolean deductMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            t.showTransaction();
        }
    }
}
