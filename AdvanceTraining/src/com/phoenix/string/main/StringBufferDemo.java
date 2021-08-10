package com.phoenix.string.main;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb1 = new StringBuffer();
		System.out.println("Capacity: "+sb1.capacity());
		System.out.println("Size: "+sb1.length());
		
	//	sb1.append("Hello");
		System.out.println("Capacity: "+sb1.capacity());
		System.out.println("Size: "+sb1.length());
	
		sb1.append("This is StringBufferDemo");
		System.out.println("Capacity: "+sb1.capacity());
		System.out.println("Size: "+sb1.length());
	
		//sb1.reverse();
		System.out.println(sb1);
		
		String s = sb1.reverse().toString();
		System.out.println(s);
		
		StringBuffer sb2 = new StringBuffer("Hello World");
		System.out.println(sb2);
		sb2.insert(6,"Great ");
		System.out.println(sb2);
		
		sb2.replace(6, 11, "Lovely");
		System.out.println(sb2);
	}

}
