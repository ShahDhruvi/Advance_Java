/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.singleton;

public class PrimeMinister {
		//reference variable 
		private static PrimeMinister pm;
		
		//constructor
		private PrimeMinister()
		{
			
		}
		
		//instance method
		public static PrimeMinister getInstance()
		{
			if(pm==null)
			{
				pm = new PrimeMinister();
			}
			return pm;
		}
		
		public void serveNation()
		{
			System.out.println("Prime Minister serves Nation!");
		}
}
