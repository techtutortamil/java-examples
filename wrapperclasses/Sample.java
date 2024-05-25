package com.techtutor.api;

import java.util.*;

public class Sample {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; // Autoboxing    
        

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        Integer c = 20;
        int d = c; // Unboxing

        System.out.println("c: " + c);
        System.out.println("d: " + d);

        String s =  "123";
        int e = Integer.parseInt(s);
        System.out.println("e: " + e);

        List<Integer> list = new ArrayList<>();

    }
}
