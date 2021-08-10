/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

package assignment2;

public class MyDateSG {
	//Data members
	private int day;
	private int month;
	private int year;

	// Default Constructor 
	MyDateSG()
	{
		System.out.println("Default Constuctor!");
	}
	
	//Parameterized Constructor using this Keyword
	MyDateSG(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
		System.out.println("Parameterized Constuctor using this keyword!");
	}
	
	//Setter method for Day
	public void setDay(int d)
	{
		day = d;
	}
	
	//Getter method for Day
	public int getDay()
	{
		return day;
	}
	
	//Setter method for Month
	public void setMonth(int m)
	{
		month = m;
	}
	
	//Getter method for Month
	public int getMonth()
	{
		return month;
	}
	
	//Setter method for Year
	public void setYear(int y)
	{
		year = y;
	}
	
	//Getter method for Year
	public int getYear()
	{
		return year;
	}
	//printDate() method to print date object
	public void printDate()
	{
		System.out.println("Date : "+ day +"/"+month+"/"+year);
	}
}
