package com.techtutor.inheritanceexample;

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("\n\nInheritance Demo");
        CollegeStudent collegeStudent = new CollegeStudent(101, "John", "ABC College", "Computer Science");
        collegeStudent.display();

        SchoolStudent schoolStudent = new SchoolStudent(201, "Jane", "XYZ School", "10th");
        schoolStudent.display();
    }
}
