/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.vehicles.cars;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Runnable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle implements Movable, Runnable {

	//implementing interface method
	public void run() 
	{
			System.out.println("Car is Running!");
	}
	
	//implementing interface method
	public void move() 
	{
			System.out.println("Car is Moving!");
	}
	
	//implementing super class method
	public void start()
	{
		System.out.println("Car is Starting!");
	}
	
	public void stop()
	{
		System.out.println("Car is Stopping!");
	}

}
