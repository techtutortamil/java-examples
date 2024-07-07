package com.techtutor.inheritanceexample;

public class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // dispaly method
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

}
