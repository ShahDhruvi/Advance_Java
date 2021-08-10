/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

package assignment2;

public class MyDateC {
	private int day;
	private int month;
	private int year;
	
	// Default Constructor
	MyDateC()
	{
		day = 8;
		month = 6;
		year = 2021;
	}
	//printDate() method to print date object
	public void printDate()
	{
		System.out.println(day +"/"+month+"/"+year);
	}
}
