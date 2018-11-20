package com.java.lessons.design.singleton;

public class LanhanSingleton {
	private static LanhanSingleton instance=null;
	private LanhanSingleton() {
	}
	synchronized public static LanhanSingleton getInstance() {
		if(instance==null) {
			 instance=new LanhanSingleton();
		}
		return instance;
	}
}
