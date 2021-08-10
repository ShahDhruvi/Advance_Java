package com.phoenix.wrapper.main;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		Integer i = Integer.valueOf(x); // primitive int to wrapper
		
		System.out.println("i primitive int to wrapper : "+i);
		
		int y = i.intValue();  //wrapper to int primitive
		
		System.out.println("y wrapper to int primitive: "+y);
		
		String s = "30";
		int j = Integer.parseInt(s);  //String to primitive
		System.out.println("j String to primitive: "+j);
		
		Integer a = Integer.valueOf(s); //String to wrapper
		System.out.println("a String to wrapper: "+a);
		
		System.out.println(Integer.toString(x));
	}

}
