package com.techtutor.polymorphism;

public class SchoolStudent extends Student {

    String schoolName;

    public SchoolStudent(String name, int age, String gender, String schoolName) {
        super(name, age, gender);
        this.schoolName = schoolName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("School Name: " + schoolName);
    }

    public static void main(String[] args) {
        SchoolStudent student = new SchoolStudent("John ", 14, "male", "ABC School");
        System.out.println("\nSchool Student Details");
        student.display();
    }

}
