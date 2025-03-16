package com.techtutor.collection.linkedlistexample;

import java.util.Iterator;
import java.util.LinkedList;

class Student {
    int id;
    String name;

    // constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

public class LinkedListApp {
    public static void main(String[] args) {
        Student student1 = new Student(1, "karupp");
        Student student2 = new Student(2, "samy");
        Student student3 = new Student(3, "sunil");

        // create a linked list
        LinkedList<Student> studentList = new LinkedList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        studentList.remove(student2);

        // iterate through the linked list while iterator
        System.out.println("\nIterating through the linked list using iterator");
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("Student ID: " + student.id + " Student Name: " + student.name);
        }

    }

}
