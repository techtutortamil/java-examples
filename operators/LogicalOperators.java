package com.techtutor.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // declare variables
        boolean a = false;
        int scienceMark = 98, mathsMark = 97;

        // logical AND operator
        if (scienceMark > 95 && mathsMark > 95) {
            System.out.println("you are eligible for medicals");
        }

        // logical OR operator
        if (scienceMark > 95 || mathsMark > 95) {
            System.out.println("you are eligible for engineering");
        }

        // logical NOT operator
        System.out.println("!a = " + !a);
    }
}
