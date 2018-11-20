package com.java.lessons.design.kaibi;

public class Disk implements IDisk {
	private String name,publisher;
    private double price;
    public Disk(String name, String publisher, double price) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.price = price;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	public String publisher() {
		// TODO Auto-generated method stub
		return this.publisher;
	}
	@Override
	public String toString() {
		return "Disk [name=" + name + ", publisher=" + publisher + ", price=" + price + "]";
	}
	 
      
     
	

}
