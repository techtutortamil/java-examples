package com.techtutor.enumexample;

enum AccountType {
    SAVINGS("saving account"), CURRENT("current account"), FD("fixed deposit"), RD("recurring deposit"),
    OD("overdraft");

    private String description;

    private AccountType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class BankApp {
    public static void main(String[] args) {
        AccountType accountType = AccountType.OD;
        // write switch case to print the description of the account type
        switch (accountType) {
            case SAVINGS:
                System.out.println("\t" + accountType.getDescription() + " rate of interest is 4%");
                break;
            case CURRENT:
                System.out.println("\t" + accountType.getDescription() + " rate of interest is 3%");
                break;
            case FD:
                System.out.println("\t" + accountType.getDescription() + " rate of interest is 6%");
                break;
            case RD:
                System.out.println("\t" + accountType.getDescription() + " rate of interest is 7%");
                break;
            default:
                System.out.println("\t" + "invalid account type");

        }

    }
}
