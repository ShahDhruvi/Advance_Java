/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.factory.cars;

public class Car {

	//instance method
	public void start()
	{
		System.out.println("Car Started!");
	}
	
	public void run()
	{
		System.out.println("Car is Running!");
	}
	
	public void stop()
	{
		System.out.println("Car Stopped!");
	}
}
