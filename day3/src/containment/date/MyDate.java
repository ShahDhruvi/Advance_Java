/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 9-June-2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */
package containment.date;

public class MyDate {

	//data members of date 
	private int day;
	private	int month;
	private	int year;
		
	//Default Constructor
	public MyDate()
	{
		day = 16;
		month = 10;
		year = 1999;
		
	}
	
	//Parameterized Constructor
	public MyDate(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
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
	
	//toString method of MyDate Class
	public String toString() {
		return day+"/"+month+"/"+year;
	}
}
