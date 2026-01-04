package com.encapsulationandpolymorphism.bankingsystem;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount(101, "Pranshi", 80000);
        BankAccount acc2 = new CurrentAccount(202, "Amit", 150000);

        acc1.deposit(5000);
        acc2.withdraw(20000);
        
        System.out.println("-------------------------------");

        System.out.println(acc1.getHolderName() + " Interest: " + acc1.calculateInterest());
        System.out.println(acc2.getHolderName() + " Interest: " + acc2.calculateInterest());
        System.out.println("-------------------------------");
        Loanable loan1 = (Loanable) acc1;
        Loanable loan2 = (Loanable) acc2;

        System.out.println("Savings Loan Eligible: " + loan1.calculateLoanEligibility());
        System.out.println("Current Loan Eligible: " + loan2.calculateLoanEligibility());
        System.out.println("-------------------------------");
    }
}
