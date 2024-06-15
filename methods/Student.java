package com.techtutor.methods;

public class Student {
    private String name;
    private int age;
    private int[] marks;

    public Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Marks: " + getTotalMarks(marks));
    }

}
