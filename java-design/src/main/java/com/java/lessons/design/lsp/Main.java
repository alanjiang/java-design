package com.java.lessons.design.lsp;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map map;
		Animal fish=new Fish();
		fish.move();
		
		Animal bird=new Bird();
		bird.move();

	}

}
