package com.techtutor.interfaceexample.defaultandstatic;

public interface Account {
    default public double calculateInterest(double amount, double rate) {
        return amount * rate;
    }

    static boolean validateAccountNumber(String accountNumber) {
        return accountNumber.matches("\\d{10}");

    }

    void deposit(double amount);
}
