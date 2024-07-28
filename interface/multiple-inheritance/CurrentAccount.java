package com.techtutor.interfaceexample;

public class CurrentAccount implements Account, Interest {

    double amount;
    double rate;

    // constructor
    public CurrentAccount(double amount, double rate) {
        this.amount = amount;
        this.rate = rate;
    }

    @Override
    public double calculateInterest(double rate) {
        return (this.amount += this.amount * rate);
    }

    @Override
    public void deposit(double amount) {
        this.amount += amount;
    }

}
