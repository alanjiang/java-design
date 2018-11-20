package com.java.lessons.design.prxoy;

public class Main {

	public static void main(String[] args) {
		 IClient realClient=new RealClient();
		
         IClient proxyClient=new ProxyClient(realClient);
         
         proxyClient.resquest();
	}

}
