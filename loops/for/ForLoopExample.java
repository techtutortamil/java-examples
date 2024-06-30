package com.techtutor.loops;

public class ForLoopExample {
    public static void main(String[] args) {
        String[] names = { "Arun", "John", "Smith", "Raj", "Rahul" };
        System.out.println("Names in the array are: \n");
        for (int i = 0; i < names.length; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(names[i]);
        }

        // enhance for loop
        System.out.println("\nNames in the array using enhanced for loop: \n");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
