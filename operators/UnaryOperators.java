package com.techtutor.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        // declare variables
        int a = 15, b = 5;

        // unary minus operator
        System.out.println("-a = " + (-a));

        // unary plus operator
        System.out.println("+a = " + (+a));

        // prefix increment operator
        System.out.println("++b = " + (++b)); // b = 6

        // prefix decrement operator
        System.out.println("--b = " + (--b)); // b = 5

        // postfix increment operator
        System.out.println("a++ = " + (a++)); // a = 15

        // postfix decrement operator
        System.out.println("a-- = " + (a--)); // a = 16

        System.out.println("a = " + a);

    }
}
