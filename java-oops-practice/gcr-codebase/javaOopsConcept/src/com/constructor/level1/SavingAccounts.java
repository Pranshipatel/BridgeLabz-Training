package com.constructor.level1;

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(String accountNumber, String accountHolder,
                   double balance, double interestRate) {

        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber); // public → accessible
        System.out.println("Account Holder : " + accountHolder); // protected → accessible
        System.out.println("Balance        : ₹" + getBalance()); // private → via getter
        System.out.println("Interest Rate  : " + interestRate + "%");
    }
}
