package com.techtutor.abstractdemo;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(double amount) {
        super(amount);
    }

    public void deposit(double amount) {
        this.amount += amount;
        System.out.println("Amount deposited successfully to Current Account with new balance: " + this.amount);
    }

    public void withdraw(double amount) {
        this.amount -= amount;
        System.out.println("Amount withdrawn successfully from Current Account with new balance: " + this.amount);
    }

}
