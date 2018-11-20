package com.java.lessongs.design.prototype.hollowclone;

public class Main {

	public static void main(String[] args) throws Exception {

       Father father=new Father();
       father.setName("Jhon");
       father.setAddress("Shanghai");
       Child child=new Child();
       child.setName("Jack");
       child.setHobby("drink");
       
       father.setChild(child);
       
       
       Father cloneFatcher=(Father)father.clone();
       cloneFatcher.getChild().setName("Mike");
       cloneFatcher.setName("Robbet");
       
       System.out.println("father="+father.toString());
       System.out.println("cloneFatcher="+cloneFatcher.toString());
       
       //father=Father [name=Jhon, address=Shanghai, child=Child [name=Mike, hobby=drink]]
       //cloneFatcher=Father [name=Robbet, address=Shanghai, child=Child [name=Mike, hobby=drink]]

       
       
	}

}
