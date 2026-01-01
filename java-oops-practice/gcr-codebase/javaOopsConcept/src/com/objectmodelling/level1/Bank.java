package com.objectmodelling.level1;

public class Bank {
	
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Association method
    public BankAccount openAccount(BankCustomer customer, double initialBalance) {
        BankAccount account = new BankAccount(this, customer, initialBalance);
        customer.addAccount(account);
        System.out.println("Account opened in " + bankName + " for " + customer.getName());
        return account;
    }

    public String getBankName() {
        return bankName;
    }
    
    public static void main(String[] args) {

        Bank hdfc = new Bank("HDFC Bank");
        Bank sbi = new Bank("SBI");

        BankCustomer pranshi = new BankCustomer("Pranshi");

        hdfc.openAccount(pranshi, 5000);
        sbi.openAccount(pranshi, 12000);

        pranshi.viewBalance();
    }
    
}
