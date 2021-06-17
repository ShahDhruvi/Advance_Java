/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.planets;

public class Jupiter extends Planet{

	//implementing abstract method 
		public boolean supportsLife()
		{
			return false;
		}
		
		//implementing interface method
		public void move()
		{
			System.out.println("Jupiter can Move!");
		}
		
		//implementing interface method
		public void revolve()
		{
			System.out.println("Jupiter can Revolve!");
		}
		
		//implementing interface method
		public void rotate()
		{
			System.out.println("Jupiter can Rotate!");
		}
}
