package com.techtutor.abstractdemo;

public class BankApp {
    public static void main(String[] args) {
        System.out.println("\n\nWelcome to the Bank App");
        BankAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.showbalance();
        BankAccount currentAccount = new CurrentAccount(2000);
        currentAccount.deposit(1000);
        currentAccount.withdraw(500);
        currentAccount.showbalance();
    }
}
