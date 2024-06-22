package com.techtutor.constructor;

public class Student {
    private String name;
    private int id;

    public Student() {
        System.out.println("\n\nno arg Constructor called");

    }

    public Student(String name, int id) {
        System.out.println("\n\nParameterized Constructor called");
        this.name = name;
        this.id = id;

    }

    public Student(Student s) {
        System.out.println("\n\nCopy Constructor called");
        this.name = s.name;
        this.id = s.id;
    }

    // display details of the student
    public void displayDetails() {
        System.out.println("\n\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {
        Student student = new Student("Samy", 101);
        Student student2 = new Student(student);
        student2.displayDetails();
    }

}
