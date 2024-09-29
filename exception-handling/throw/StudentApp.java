package com.techtutor.exceptionhandling;

public class StudentApp {
    public static void main(String[] args) {
        try {
            Student student = new Student("karuppu", 4);
            System.out.println("Student created successfully");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        Student student1 = new Student("samy", 10);
        System.out.println("Student created successfully");
    }
}
