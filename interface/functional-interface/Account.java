package com.techtutor.interfaceexample.fiexample;

@FunctionalInterface
public interface Account {

    void calculateInterest(double amount, double rate);

    default public double calculateInterestDefault(double amount, double rate) {
        return amount * rate;
    }

    static boolean validateAccountNumber(String accountNumber) {
        return accountNumber.matches("\\d{10}");

    }

    static boolean validateBranchCode(String branchCode) {
        return branchCode.matches("\\d{5}");

    }

}
