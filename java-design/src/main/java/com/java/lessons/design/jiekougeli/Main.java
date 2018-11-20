package com.java.lessons.design.jiekougeli;

public class Main {

	public static void main(String[] args) {
		
		 //只调用写字的动作，使用IPeople接口的实现
		 IPeople chinese_people=new ChinesePeople();
		 IPeople english_people=new EnglishPeople();
		 chinese_people.write();
		 english_people.write();
		//只调用喝水、吃、行走的动作，使用IAnimal接口的实现
		 IAnimal chinese_animal=new ChinesePeople();
		 chinese_animal.drink();
		 chinese_animal.eat();
		 chinese_animal.walk();
		 
		 

	}

}
