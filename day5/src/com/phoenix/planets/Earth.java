/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.planets;

public class Earth extends Planet{
	
	//implementing abstract method 
	public boolean supportsLife()
	{
		return true;
	}
	
	//implementing interface method
	public void move()
	{
		System.out.println("Earth can Move!");
	}
	
	//implementing interface method
	public void revolve()
	{
		System.out.println("Earth can Revolve!");
	}
	
	//implementing interface method
	public void rotate()
	{
		System.out.println("Earth can Rotate!");
	}
	
}
