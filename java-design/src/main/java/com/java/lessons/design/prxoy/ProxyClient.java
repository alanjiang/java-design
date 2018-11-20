package com.java.lessons.design.prxoy;

public class ProxyClient implements IClient {
   private IClient realClient;
	public ProxyClient(IClient realClient) {
	    this.realClient = realClient;
    }
    public void beforeRequest() {
    	System.out.println(">>>>代理客户端调用真实客户端前<<<<<");
    }
    
	@Override
	public void resquest() {
		beforeRequest();
		realClient.resquest();
		afterRequest();
	}

	public void afterRequest() {
    	System.out.println(">>>>代理客户端调用真实客户端前<<<<<");
    }
}
