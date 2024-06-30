package com.techtutor.loops;

public class WhileLoopExample {
    public static void main(String[] args) {
        String[] names = { "Arun", "Bala", "Chandra", "Dinesh", "Eswar", "Fayaz" };
        int i = 0;
        System.out.println("Names in the array are: \n");
        while (i < names.length) {
            if (i == 3) {
                break;
            }
            System.out.println(names[i]);
            i++;
        }

    }
}
