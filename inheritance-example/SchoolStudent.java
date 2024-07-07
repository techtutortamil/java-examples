package com.techtutor.inheritanceexample;

public class SchoolStudent extends Student {

    String schoolName;
    String grade;

    public SchoolStudent(int rollNo, String name, String schoolName, String grade) {
        super(rollNo, name);
        this.schoolName = schoolName;
        this.grade = grade;
    }

    // display method
    public void display() {
        super.display();
        System.out.println("School Name: " + schoolName);
        System.out.println("Grade: " + grade);
    }

}
