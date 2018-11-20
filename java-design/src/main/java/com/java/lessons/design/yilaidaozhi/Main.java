package com.java.lessons.design.yilaidaozhi;

public class Main {

	public static void main(String[] args) {
	
		 IDriver laowang=new Driver("老王");
		 ICar benz=new Car("Benz");
		 laowang.drive(benz);
		 benz.run();
		 //
         IDriver laoli=new Driver("老李");
		 
		 ICar bmw=new Car("宝马");
		 
		 laoli.drive(bmw);
		 bmw.run();

	}

}
