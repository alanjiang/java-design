package com.java.lessons.design.chouxianggongchang;

public interface ICreator {

	<T extends IProduct> T factory(Class<T> clazz);
}
