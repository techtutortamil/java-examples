package com.techtutor.exceptionhandling;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        if (age < 5) {
            throw new IllegalArgumentException("Student Age cannot be less than 5");
        }
        this.name = name;
        this.age = age;
    }

}
