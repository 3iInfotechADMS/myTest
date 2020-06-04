package com.infotech;

public class MyApp {

	public static void main(String[] args) {
		int a=10,b=5;
		Add a1=new Add();
		Sub s1=new Sub();
		
		System.out.println(a1.sum(a, b));
		System.out.println(s1.diff(a, b));
		
	}

}
