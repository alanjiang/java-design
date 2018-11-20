package com.java.lessongs.design.prototype.hollowclone;

public class Father implements Cloneable {

	private String name;
	private String address;
	private Child child;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "Father [name=" + name + ", address=" + address + ", child=" + child.toString() + "]";
	}

	

}
