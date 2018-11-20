package com.java.lessongs.design.prototype.deepclone;

public class Child implements Cloneable {
  
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}

	private String name;
	
	private String hobby;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Child [name=" + name + ", hobby=" + hobby + "]";
	}
	
}
