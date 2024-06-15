package com.techtutor.methods;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20, new int[] { 90, 80, 70 });
        student1.display();

        Student student2 = new Student("Jane", 21, new int[] { 85, 75, 65 });
        student2.display();
    }
}
