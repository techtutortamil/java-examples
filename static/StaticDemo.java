package com.techtutor.staticdemo;

class Student {
    int rollNo;
    String name;

    static int totalStudents;

    static {
        totalStudents = 0;
        System.out.println("\n\n Static block called");
    }

    static {

        System.out.println("Static block called 2");
    }

    static {
        System.out.println("Static block called 3");
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        totalStudents++;
    }

    // display
    void display() {
        System.out.println("Roll No: " + rollNo + " Name: " + name);
    }

    static void showTotalStudents() {
        System.out.println("Total  Students from static method: " + totalStudents);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "John");
        Student s2 = new Student(2, "Jane");
        Student s3 = new Student(3, "Doe");

        System.out.println("\n\nStudent Details:");

        s1.display();
        s2.display();
        s3.display();

        // System.out.println("Total Students: " + Student.totalStudents);
        Student.showTotalStudents();
    }
}
