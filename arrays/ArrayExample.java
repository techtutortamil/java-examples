package com.techtutor.arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = { 10, 30, 20, 50, 40 };
        // int[] newNumbers = Arrays.copyOf(numbers, 5);

        System.out.println("before sorting ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        Arrays.sort(numbers);

        System.out.println("after sorting ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        Student[] students = new Student[3];

        students[0] = new Student("John", 20, "CSE");
        students[1] = new Student("karuppu", 25, "IT");
        students[2] = new Student("Raj", 22, "ECE");

        // enhance for loop
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge() + " " + student.getDept());
        }
    }
}
