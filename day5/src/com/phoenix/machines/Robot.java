/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.machines;

import com.phoenix.interfaces.Movable;

public class Robot implements Movable {

	//non-static methods
	public void processData()
	{
		System.out.println("Data is processing!");
	}
	
	public void senseInfo()
	{
		System.out.println("Sense Infomation!");
	}
	
	public void useArtificialIntelligence()
	{
		System.out.println("Robot is using Artificial Intelligence");
	}
	
	//implementing interface method
	public void move() {
		System.out.println("Robot Moves!");
	}
}
