package com.java.lessons.design.chouxianggongchang;

public class Main {

	public static void main(String[] args) {
		ICreator creator=new Creator();
		IProduct product=creator.factory(Product.class);
		product.function();
	}

}
