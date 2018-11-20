package com.java.lessons.design.chouxianggongchang;

public class Creator implements ICreator {

	@Override
	public <T extends IProduct> T factory(Class<T> clazz) {
		 IProduct product=null;
		 try {
			product=(IProduct) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException  | IllegalAccessException |ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T)product;
		
	}

}
