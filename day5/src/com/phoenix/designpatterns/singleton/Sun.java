/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.singleton;

public class Sun {

	//reference variable 
	private static Sun s;
	
	//constructor
	private Sun()
	{
		
	}
	
	//instance method
	public static Sun getInstance()
	{
		if(s==null)
		{
			s = new Sun();
		}
		return s;
	}
	
	public void givesLight()
	{
		System.out.println("Sun Gives Light!");
	}
}
