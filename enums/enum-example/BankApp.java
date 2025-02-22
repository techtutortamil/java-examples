package com.techtutor.enumdemo;

enum AccountType {
    SAVINGS("saving account"), CURRENT("current account"), FD("fixed deposit"), RD("recurring deposit");

    private String accountTypeDesc;

    private AccountType(String accountTypeDesc) {
        this.accountTypeDesc = accountTypeDesc;
    }

    public String getAccountTypeDesc() {
        return accountTypeDesc;
    }

}

public class BankApp {
    public static void main(String[] args) {
        // AccountType accountType = AccountType.RD;
        // System.out.println("\n Account Type Order: " + accountType.ordinal());

        for (AccountType accountTypeTemp : AccountType.values()) {
            System.out.println("\n Account Type: " + accountTypeTemp + " Order: " + accountTypeTemp.ordinal() +
                    " Description: " + accountTypeTemp.getAccountTypeDesc());
        }
    }
}
