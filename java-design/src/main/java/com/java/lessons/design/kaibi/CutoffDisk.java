package com.java.lessons.design.kaibi;

public class CutoffDisk extends Disk {
	public CutoffDisk(String name, String publisher, double price) {
		super(name, publisher, price);
	}
	@Override
	public double getPrice() {
		return (super.getPrice()>150)? super.getPrice()-5:super.getPrice();
	}
	@Override
	public String toString() {
		return "CutoffDisk [getPrice()=" + getPrice() + ", getName()=" + getName() + ", publisher()=" + publisher()+"]";
	}
	
}
