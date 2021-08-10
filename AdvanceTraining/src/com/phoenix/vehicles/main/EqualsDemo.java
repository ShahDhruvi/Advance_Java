package com.phoenix.vehicles.main;

import com.phoenix.vehicles.Car;

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello";
		String s2 = "Hello";

		if (s1.equals(s2))
			System.out.println("same content");
		else
			System.out.println("different contents");
		
		Car car1 = new Car(101, "Tata Nexon", 750000.00f);
		Car car2 = new Car(101, "Tata Nexon", 750000.00f);
		if(car1.equals(car2))
			System.out.println("same cars");
		else
			System.out.println("different cars");
		
/////////////////////////////////////////////////////////////////
		
		
		if (car1.equals(s2))
			System.out.println("same content");
		else
			System.out.println("different contents");
		 
	}

}
