package com.techtutor.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class TryWithResourcesExample {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(
                "D:\\Karuppu\\Training\\Projects\\maven-example\\my-app\\src\\main\\resources\\student.txt"))) {
            String line;
            System.out.println("Student details:\n");
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
