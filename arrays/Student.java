package com.techtutor.arrays;

public class Student {
    private String name;
    private int age;
    private String dept;

    public Student(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }
}
