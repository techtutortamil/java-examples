package com.techtutor.exceptionhandling;

public class Student {
    public static void main(String[] args) {
        int[] marks = { 50, 60, 70 };
        int markscount = 3;
        try {
            System.out.println("\n db connection open");
            System.out.println("\n avg::" + (marks[0] + marks[1] + marks[2]) / markscount);
        } finally {
            System.out.println("\n db connection close");
        }
        System.out.println("program continues");

    }
}
