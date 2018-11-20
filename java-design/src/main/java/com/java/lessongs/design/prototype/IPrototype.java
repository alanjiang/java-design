package com.java.lessongs.design.prototype;

public interface IPrototype extends Cloneable{

	  IPrototype clone();
	  void doBusiness();
}
