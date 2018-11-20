package com.java.lessongs.design.prototype;

public class ShortMessage implements Cloneable {
   private String title;
   private String mobile;//different
   private String content;
   private String clientName;//different
   private String companyName;
   public ShortMessage(String title, String companyName) {
	this.title = title;
	this.companyName = companyName;
}

   @Override
   protected Object clone() throws CloneNotSupportedException {
	      
	     return super.clone();
   }

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
   
}
