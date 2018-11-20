package com.java.lessongs.design.prototype;

import java.util.Date;
public class Main {
	public static void main(String[] args) throws Exception {
		long start=new Date().getTime();
		ShortMessage message=new ShortMessage("2019双11促销", "天猫商城");
		ShortMessage sendMessage=null;
		for(int i=0;i<50000;i++) {
			//克隆浅复制对象，性能更高：
			//克隆
		    //sendMessage=(ShortMessage)message.clone();//4423 ms
			//不克隆
			sendMessage=new ShortMessage("2019双11促销", "天猫商城");//5539 ms 
			sendMessage.setClientName("A"+i);
			if(i<10) {
				sendMessage.setMobile("1"+i+"30568907"+i);
			}else if(i>10 && i<100) {
				sendMessage.setMobile("1"+i+"30568903");
			}
			else if(i>100 && i<1000) {
				sendMessage.setMobile("1"+i+"3056890");
			}
			else if(i>1000 && i<10000) {
				sendMessage.setMobile("1"+i+"305689");
			}else {
				sendMessage.setMobile("1"+i+"30568");
			}
			System.out.println(message.equals(sendMessage));
			sendMessage.setContent("尊敬的"+sendMessage.getClientName()+",双11所有商品低至7折，欢迎来抢货!");
			sendShortMessage(sendMessage);
		}
		
		long end=new Date().getTime();
		System.out.println((end-start));
	}
	
	 static void sendShortMessage(ShortMessage message) {
		  
		 System.out.println("["+message.getMobile()+"]\n\t"+message.getTitle()+"\n\t"
				 
				 +message.getContent()+"\t\n["+message.getCompanyName()+"]");
	}
		
	
}
