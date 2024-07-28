package com.techtutor.interfaceexample;

public class BankApp {
    public static void main(String[] args) {
        System.out.println("\n\nBank Application");
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(1000, 0.03);

        System.out.println("Savings Account Balance: " + savingsAccount.calculateInterest(0.05));
        System.out.println("Current Account Balance: " + currentAccount.calculateInterest(0.03));
    }
}
