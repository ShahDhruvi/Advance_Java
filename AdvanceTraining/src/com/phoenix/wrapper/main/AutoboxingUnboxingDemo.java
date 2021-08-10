package com.phoenix.wrapper.main;

public class AutoboxingUnboxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 25;
		Integer i = x;
		System.out.println("Autoboxing I:" + i);//autoboxing
		
		int y = i;
		System.out.println("Autounboxing y:" + y);//autounboxing
		
		float f = i;
		System.out.println("Autounboxing f Integer to float :" + f);//autounboxing
	
		Integer i1 = 100;
		float f1 = 100.0f;
		double d1 = 100.00;
		if(i1==f1)
			System.out.println("true");
		else
			System.out.println("false");
	
	
	
	
	}

}
