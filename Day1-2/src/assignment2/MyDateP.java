/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

package assignment2;

public class MyDateP {
	
	//data members
	private int day;
	private int month;
	private int year;
	
	// Default Constructor 
	MyDateP()
	{
		day = 8;
		month = 6;
		year = 2021;
		System.out.println("Default Constuctor!");
	}
	
	//Parameterized Constuctor 
	MyDateP(int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
		System.out.println("Parameterized Constuctor!");
	}
	
	//printDate() method to print date object
		public void printDate()
		{
			System.out.println("Date : "+ day +"/"+month+"/"+year);
		}
}
