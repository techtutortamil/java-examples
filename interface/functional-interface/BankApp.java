package com.techtutor.interfaceexample.fiexample;

public class BankApp {

    public static void main(String[] args) {
        Account account = (amount, rate) -> {
            System.out.println("\n\nInterest: " + amount * rate);
        };

        account.calculateInterest(1000, 0.05);
    }

}
