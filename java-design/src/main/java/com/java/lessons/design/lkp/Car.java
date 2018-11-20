package com.java.lessons.design.lkp;

public class Car {
  
	public void startCar(Key key) {
		key.turnOn();
		System.out.println("车启动");
	}
	
    public void stopCar(Key key) {
		key.turnOff();
		System.out.println("车停止");
	}
}
