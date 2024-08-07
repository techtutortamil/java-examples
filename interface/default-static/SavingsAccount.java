package com.techtutor.interfaceexample.defaultandstatic;

public class SavingsAccount implements Account {

    private String accountNumber;
    private double amount;
    private double rate;

    // constructor
    public SavingsAccount(String accountNumber, double amount, double rate) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.rate = rate;
    }

    public double calculateInterest(double amount, double rate) {
        System.out.println("SavingsAccount.calculateInterest");
        this.rate += 0.02;
        return amount * rate;
    }

    @Override
    public void deposit(double amount) {
        this.amount += amount;
    }

    public static void main(String[] args) {
        System.out.println("\nSavings Account Example");
        SavingsAccount account = new SavingsAccount("1234567890", 1000, 0.05);
        account.deposit(500);
        System.out.println("Interest: " + account.calculateInterest(account.amount, account.rate));
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Account Number is valid: " + Account.validateAccountNumber(account.accountNumber));
    }

}
