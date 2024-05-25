package com.techtutor.web.product;

public class Product {
	
	public String name;
	public int id;
	public double price;
	public Product(String name, int id, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	
	
}
