package com.techtutor.operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        // declare variables
        int a = 15, b = 5, c = 2, d = 3, e = 1;
        // addition operator
        System.out.println("a + b = " + (a + b));
        // subtraction operator
        System.out.println("a - b = " + (a - b));
        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % c));

        // BODMAS expression
        int result = a + ((b * c) / d) - e; // equivalent to a + ((b * c) / d) - e

        System.out.println("Result = " + result);
    }

}
