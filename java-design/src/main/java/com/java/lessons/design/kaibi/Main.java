package com.java.lessons.design.kaibi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		List<IDisk> disks=new ArrayList<IDisk>();
		IDisk disk1=new Disk("班得瑞","好莱坞",12);
		IDisk disk2=new DiscountDisk("Beyond乐队","滚石唱片",76);
		IDisk disk3=new CutoffDisk("许嵩专辑","北京唱片",94);
		IDisk disk4=new CutoffDisk("王菲专辑","滚石唱片",218);
	    //老王将4件光碟加入购物车集合
		disks.add(disk1);
		disks.add(disk2);
		disks.add(disk3);
		disks.add(disk4);
		//前台结账：
	    double sum=0d;	
	    for(IDisk disk:disks) {
	    	System.out.println(">>>>"+disk.toString());
	    	sum+=disk.getPrice();
	    }
		System.out.println(">>>总共花钱:"+sum);
		
		

	}

}
