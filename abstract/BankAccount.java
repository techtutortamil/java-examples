package com.techtutor.abstractdemo;

public abstract class BankAccount {
    double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void showbalance() {
        System.out.println("Current balance: " + this.amount);
    }

}
