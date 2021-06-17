/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.vehicles;

public abstract class Vehicle {

	//non-abstract methods
	protected void start()
	{
		System.out.println("Vehicle is Starting!");
	}
	
	protected void stop()
	{
		System.out.println("Vehicle is Stopping!");
	}
}
