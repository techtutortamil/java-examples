package com.techtutor.polymorphism;

public class Student {
    String name;
    int age;
    String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender " + gender);
    }

}
