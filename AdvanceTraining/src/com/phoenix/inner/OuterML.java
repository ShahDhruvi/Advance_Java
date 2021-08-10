package com.phoenix.inner;

public class OuterML {

	public void show() 
	{
		 int a=10;
		 class Inner
		 {
			 private int x;
			 
			 public Inner() {
				 x=100;
			 }
			 
			 public Inner(int x) {
				 super();
				 this.x = x;	 
			 }
			 
			 public void test() {
				 System.out.println("Local Inner class variable: " +x);
				 System.out.println("Method Variable: "+a);
			 }
		 }
		 Inner i = new Inner();
		 i.test();
	}
}
