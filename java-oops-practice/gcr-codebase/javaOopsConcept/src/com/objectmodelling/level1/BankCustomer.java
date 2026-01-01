package com.objectmodelling.level1;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	
    private String name;
    private List<BankAccount> accounts;

    public BankCustomer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // Communication method
    public void viewBalance() {
        System.out.println("Accounts of " + name + ":");
        for (BankAccount acc : accounts) {
            System.out.println(
                "Bank: " + acc.getBank().getBankName() +
                ", Balance: ₹" + acc.getBalance()
            );
        }
    }

    public String getName() {
        return name;
    }
    
}
