package com.phoenix.inner;

public class Outer {

	private static int x=10;
	
	public Outer() {
		x=100;
		//System.out.println("X: " +x);
	}

	public Outer(int x) {
		super();
		this.x = x;
		//System.out.println("X: " +x);
	}
	
	public void test() {
		System.out.println("Variable in outer class: " +x);
	}
	
	//static inner class
	public static class Inner{
		
		private static int y=20;
		
		public void show()
		{
			System.out.println("Variable in static inner class: " +y);
			System.out.println("Variabl in outer class: "+x); 
		}
	}
}
