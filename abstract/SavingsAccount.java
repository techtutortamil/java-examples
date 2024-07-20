package com.techtutor.abstractdemo;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double amount) {
        super(amount);
    }

    public void deposit(double amount) {
        this.amount += amount;
        System.out.println("Amount deposited successfully to Savings Account with new balance: " + this.amount);
    }

    public void withdraw(double amount) {
        this.amount -= amount;
        System.out.println("Amount withdrawn successfully from Savings Account with new balance: " + this.amount);
    }

}
