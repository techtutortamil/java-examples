package com.techtutor.conditionalstatements;

public class Student {
    public static void main(String[] args) {
        System.out.println("program begins");

        int marks = 50;
        int attendence = 40;

        if (attendence > 50) {
            if (marks >= 50) {
                System.out.println("Student is passed");
            } else {
                System.out.println("Student is failed");
            }
        } else {
            System.out.println("Student is failed due to low attendence");
        }

        System.out.println("program ends");
    }
}
