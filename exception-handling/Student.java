package com.techtutor.exceptionhandling;

public class Student {
    public static void main(String[] args) {
        int[] marks = { 50, 60, 70 };
        int markscount = 0;
        try {
            System.out.println("marks::" + marks[3]); // Array index out of bound exception
            System.out.println("Avg::" + (marks[0] + marks[1] + marks[2]) / markscount);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please pass valid index");
        } catch (ArithmeticException e) {
            System.out.println("Please pass valid denominator ");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println("program continues");

    }
}
