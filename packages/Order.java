package com.techtutor.web.order;

import java.util.*;


import com.techtutor.web.product.Product;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Order {

	public static void main(String args[]) {
		Product p1 = new Product("dell laptop",1,25000);
		System.out.println("order placed "+p1);
		
		Product p2 = new Product("acer laptop",2,22000);
		
		List<Product> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		
		System.out.println("list of order placed "+list);
		
		double radious = 2.5;
		
		double area = PI * pow(radious, 2);
		
		
		System.out.println("area of circle "+area);
		
	}
}
