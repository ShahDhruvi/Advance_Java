package com.phoenix.vehicles.main;

import com.phoenix.vehicles.Car;

public class HashcodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  StringBuffer s1 = new StringBuffer("Hello"); StringBuffer s2 = new
		  StringBuffer("Hello");
		  
		  String st1 = new String("hello");
		  
		  String st2 = new String("hello");
		  //System.out.println(s1.equals(s2));
		  System.out.println("Hash Code of StringB 1: " + s1.hashCode());
		  System.out.println("Hash Code of StringB 2: " + s2.hashCode());
		  
		  
		  System.out.println("Hash Code of String st1: " + st1.hashCode());
		  System.out.println("Hash Code of String st2: " + st2.hashCode());
		  
		  Car car1 = new Car(101, "Tata Nexon", 750000.00f); 
		  Car car2 = new Car(101,"Tata Nexon", 750000.00f);
		  
		  System.out.println("Hash Code of Car 1: " + car1.hashCode());
		  System.out.println("Hash Code of Car 2: " + car2.hashCode());
	}

}
