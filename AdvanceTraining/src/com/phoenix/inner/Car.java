package com.phoenix.inner;

public class Car {

	public void show() {
		f.drive();
		System.out.println("------------------------------------------------");
		d.drive();
	}
	Ferrari f = new Ferrari() {
		
		public void showModel() {
			System.out.println(f.type());
		}
		public void drive() {
			showModel();
			System.out.println("Anonymous class " + f.type());
		}
	};
	
	//////////////////////////////////////////////////////////////////
	
	Driveable d = new Driveable() {

		@Override
		public void drive() {
			// TODO Auto-generated method stub
			System.out.println("Anonymous Class");
		}	
	};
}
