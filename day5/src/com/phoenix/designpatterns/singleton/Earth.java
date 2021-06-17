/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.singleton;

public class Earth {
		//reference variable 
		private static Earth e;
		
		//constructor
		private Earth()
		{
			
		}
		
		//instance method
		public static Earth getInstance()
		{
			if(e==null)
			{
				e = new Earth();
			}
			return e;
		}
		
		public void createLife()
		{
			System.out.println("Earth Creates Life!");
		}
}
