package com.java.lessons.design.yilaidaozhi;

public class Car implements ICar {
    private String brand;
    
	public Car(String brand) {
		
		this.brand = brand;
	}

	public void run() {
		
		System.out.println(String.format("%s 车在跑....",brand));
	}

	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}
    
}
