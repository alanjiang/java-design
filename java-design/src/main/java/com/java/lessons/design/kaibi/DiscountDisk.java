package com.java.lessons.design.kaibi;

public class DiscountDisk extends Disk {
    
	public DiscountDisk(String name, String publisher, double price) {
		super(name, publisher, price);
	}
	@Override
	public double getPrice() {
		return super.getPrice()*0.8;
	}
	@Override
	public String toString() {
		return "DiscountDisk [getPrice()=" + getPrice() + ", getName()=" + getName() + ", publisher()=" + publisher()
				+ "]";
	}

}
