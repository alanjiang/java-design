package com.java.lessons.design.lkp;

public class Key {
    
	 Engine engine=new Engine();
	 public void turnOn() {
		 System.out.println("打开车钥匙");
		 engine.igniteFire();
	 }
	 public void turnOff() {
		 System.out.println("关闭车钥匙");
		 engine.extinguishFire();
	 }
}
