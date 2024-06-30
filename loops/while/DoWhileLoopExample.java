package com.techtutor.loops;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        String[] names = { "Arun", "Bala", "Chandra", "Dinesh", "Eswar", "Fayaz" };
        int i = 0;
        System.out.println("Names in the array are: \n");
        do {

            System.out.println(names[i]);
            i++;
        } while (i < names.length);
    }
}
