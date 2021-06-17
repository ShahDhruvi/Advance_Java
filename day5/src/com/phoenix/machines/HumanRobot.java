/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.machines;

import com.phoenix.interfaces.Walkable;

public class HumanRobot extends Robot implements Walkable {

	//implementing interface method
	public void jump() 
	{
		System.out.println("Human Robot Jumps!");
	}

	//implementing interface method
	public void move() 
	{
		System.out.println("Human Robot Moves!");
	}

	//implementing interface method
	public void run() 
	{
		System.out.println("Human Robot Runs!");
	}

	//implementing interface method
	public void walk() 
	{
		System.out.println("Human Robot Walks!");
	}
	
	public void useArtificialIntelligence()
	{
		System.out.println("Human Robot is using Artificial Intelligence");
	}
}
