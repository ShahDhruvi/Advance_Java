package com.phoenix.statics.imports.main;

import com.phoenix.vehicles.Car;

import static java.lang.Integer.parseInt;
import static com.phoenix.vehicles.Car.count;

public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a = Integer.parseInt("20");
		int a = parseInt("20");
		System.out.println(a);
		
		int b = parseInt("500");
		System.out.println(b);
		
		System.out.println("no of car objects: " + count);
		
		Car c1 = new Car();
		Car c2 = new Car(1001, "TATA NEXON" , 500000.00f);
		System.out.println("no of car objects: " + count);
	}
}
