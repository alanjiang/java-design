package com.java.lessons.design.jiekougeli;

public class BailinBird implements IBird, IAnimal {

	public void eat() {
		System.out.println("---百灵鸟吃---");
	}

	public void walk() {
		System.out.println("---百灵鸟行走---");
	}

	public void drink() {
		System.out.println("---百灵鸟喝水---");
	}

	public void fly() {
		System.out.println("---百灵鸟飞翔---");

	}

}
