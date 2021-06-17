/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.singleton;

public class President {
		//reference variable 
		private static President p;
		
		//constructor
		private President()
		{
			
		}
		
		//instance method
		public static President getInstance()
		{
			if(p==null)
			{
				p = new President();
			}
			return p;
		}
		
		public void representNation()
		{
			System.out.println("President represent Nation!");
		}

}
