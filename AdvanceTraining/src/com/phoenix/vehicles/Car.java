package com.phoenix.vehicles;

import com.phoenix.annotations.CopyrightInfo;

@CopyrightInfo(author = "dhruvi.shah1@stltech.in")
public class Car {

	@CopyrightInfo(author = "dhruvi.shah1@stltech.in",version = 2.0)
	private int id;
	private String model;
	private float price;
	public static int count;
	

	public Car() {
		// TODO Auto-generated constructor stub
		count++;
	}
	
	/*
	 * public class demo{ //static int y; }
	 */
	
	public Car(int id, String model, float price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		count++;
	}

	//getter setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

//@CopyrightInfo(author = "dhruvi.shah1@stltech.in",version = 2.0)
	public void setPrice(float price) {
		this.price = price;
	}
	
	//toString
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", price=" + price + "]";
	}
	
	//Overriding equals method of object class
	public boolean equals(Object ob) {
			if(ob instanceof Car) 
			{
			Car car = (Car) ob; //downcasting object to car type
			if(this.id==car.id && 
					this.model.equals(car.model) && 
					   this.price==car.price)
				return true;
			}
		return false;
	}
	
	//Overriding equals method of object class
	public int hashCode() {
		return  id + model.hashCode() + (int)price;
	}
}
