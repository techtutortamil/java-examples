package com.techtutor.collection.setexample;

import java.util.Set;
import java.util.HashSet;

public class BankApp {
    public static void main(String[] args) {
        Set<String> customerIds = new HashSet<>();

        customerIds.add("C1001");
        customerIds.add("C1002");
        customerIds.add("C1003");
        customerIds.add("C1004");

        customerIds.clear();
        
        System.out.println("\n Customer Ids: " + customerIds);

    }
}
