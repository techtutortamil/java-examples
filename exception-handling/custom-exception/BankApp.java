package com.techtutor.exceptionhandling;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(1500);
        } catch (InSufficientAmountException e) {
            System.out.println(e.getMessage());
        }
        account.deposit(500);
        System.out.println("Balance: " + account.getBalance());
    }
}
