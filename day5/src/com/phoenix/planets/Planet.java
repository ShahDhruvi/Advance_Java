/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.planets;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotatable;

public abstract class Planet implements Movable, Rotatable, Revolvable {

	//data members
	int noOfMoons;

	//setter method for no of moon
	public void setNoOfMoons(int m)
	{
		noOfMoons = m;
	}
	
	//getter method for no of moons
	public int getNoOfMoons()
	{
		return noOfMoons;
	}
	
	//abstract method
	protected abstract boolean supportsLife();
	
	//toString method
	public String toString()
	{
		return "No of Moons: "+noOfMoons;
	}
}
