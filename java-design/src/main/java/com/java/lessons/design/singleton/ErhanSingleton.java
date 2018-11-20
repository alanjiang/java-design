package com.java.lessons.design.singleton;

public class ErhanSingleton {
	private static ErhanSingleton instance=new ErhanSingleton();
	private ErhanSingleton() {
	}
	public static ErhanSingleton getInstance() {
		return instance;
	}
}
