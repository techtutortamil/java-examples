package com.techtutor.operators;

public class AssignmentOperators {
    public static void main(String[] args) {

        // create variables
        int a = 5;
        int result;

        // assign value using =
        result = a;

        System.out.println("result using =: " + result);

        // assign value using =+
        result += a; // result = result + a

        System.out.println("result using +=: " + result);

        // assign value using =*
        result *= a; // result = result * a

        System.out.println("result using *=: " + result);

    }
}
