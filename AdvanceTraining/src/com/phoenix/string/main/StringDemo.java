package com.phoenix.string.main;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		String s2 = "Hello";
		//if(s1.equals(s2))
		if(s1==s2)
			System.out.println("same refernce");
		else
			System.out.println("Different");
		if(s1.equals(s2))
			System.out.println("same contents");
		else
			System.out.println("Different contents");
		
		
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello");
		
		StringBuffer sb2 = new StringBuffer("hello");
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		if(sb1==sb2)
			System.out.println("same refernce");
		else
			System.out.println("Different");
		
		if(sb1.equals(sb2))
			System.out.println("same contents");
		else
			System.out.println("Different contents");
		
	}

}
