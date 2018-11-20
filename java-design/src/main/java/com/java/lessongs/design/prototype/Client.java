package com.java.lessongs.design.prototype;

public class Client {

	   public static void main(String[] args) {
		   
		   IPrototype prototype=new Prototype();
		   prototype.clone().doBusiness();
		   
	   }
}
