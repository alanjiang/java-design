package com.java.lessons.design.yilaidaozhi;

public class Driver implements IDriver {
    private String name;
    
	public Driver(String name) {
		
		this.name = name;
	}

	public void drive(ICar car) {
		
        System.out.println(String.format("--司机%s 开 %s 车",name,car.getBrand()));
	}

}
