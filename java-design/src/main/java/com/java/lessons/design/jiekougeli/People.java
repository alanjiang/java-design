package com.java.lessons.design.jiekougeli;

public class People implements IAnimal, IPeople {
	public void write() {
	   System.out.println("---人写字---");
	}

	public void eat() {
		System.out.println("---人吃东西---");
	}

	public void walk() {
		System.out.println("---人行走---");
	}

	public void drink() {
	
		System.out.println("---人喝水---");
	}

}
