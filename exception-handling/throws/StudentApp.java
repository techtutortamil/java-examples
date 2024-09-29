package com.techtutor.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class StudentApp {
    public static void main(String[] args) {
        try {
            readStudents();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readStudents() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/student.txt"));
        String line = null;
        System.out.println("Reading from file\n");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

}
