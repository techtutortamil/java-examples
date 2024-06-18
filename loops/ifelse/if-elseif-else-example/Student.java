package com.techtutor.conditionalstatements;

public class Student {
    public static void main(String[] args) {
        System.out.println("program begins");
        int marks = 60;

        if (marks >= 90) {
            System.out.println("Student has scored A grade");
        } else if (marks >= 80) {
            System.out.println("Student has scored B grade");
        } else if (marks >= 70) {
            System.out.println("Student has scored C grade");
        } else if (marks >= 60) {
            System.out.println("Student has scored D grade");
        } else {
            System.out.println("Student has failed");
        }

        System.out.println("program begins");
    }
}
