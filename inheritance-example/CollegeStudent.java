package com.techtutor.inheritanceexample;

public class CollegeStudent extends Student {

    String collegeName;
    String major;

    // constructor
    public CollegeStudent(int rollNo, String name, String collegeName, String major) {
        super(rollNo, name);
        this.collegeName = collegeName;
        this.major = major;
    }

    // display method
    public void display() {
        super.display();
        System.out.println("College Name: " + collegeName);
        System.out.println("Major: " + major);
    }

}
