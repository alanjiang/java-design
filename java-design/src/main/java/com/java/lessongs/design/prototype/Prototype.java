package com.java.lessongs.design.prototype;

public class Prototype implements IPrototype {

	@Override
	public IPrototype clone() {
		
		 try {
			return (IPrototype)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public void doBusiness() {
		System.out.println("----do business----");
	}

}
