package com.techtutor.exceptionhandling;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // withdraw method
    public void withdraw(double amount) throws InSufficientAmountException {

        if (balance < amount) {
            throw new InSufficientAmountException("Insufficient balance: " + balance);
        }
        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount: " + amount);
        }
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

}
