package com.techtutor.polymorphism;

public class StudentManager {

    public void calcuateTotalMarks(int marks1, int marks2) {
        System.out.println("Total Marks: " + (marks1 + marks2));
    }

    public void calcuateTotalMarks(int marks1, int marks2, int marks3) {
        System.out.println("Total Marks: " + (marks1 + marks2 + marks3));
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        System.out.println("\n\nTotal Marks for  subjects");
        studentManager.calcuateTotalMarks(80, 90);
        studentManager.calcuateTotalMarks(80, 90, 85);
    }
}
