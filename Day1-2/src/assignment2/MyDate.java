/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package assignment2;

public class MyDate
{
	//data members of date 
	private int day;
	private	int month;
	private	int year;
	
	//initDate method to initialize data object
	public void initDate(int d, int mon, int y)
	{
		day = d;
		month = mon;
		year = y;
	}
	
	//printDate() method to print date object
	public void printDate()
	{
		System.out.println(day +"/"+month+"/"+year);
	}
}