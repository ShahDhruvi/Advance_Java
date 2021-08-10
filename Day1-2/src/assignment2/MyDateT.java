/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package assignment2;

public class MyDateT {
	//Data members
	private int day;
	private int month;
	private int year;
	
	// Default Constructor 
		MyDateT()
		{
			day = 9;
			month = 6;
			year = 2021;
			System.out.println("Default Constuctor!");
		}
		
	//Parameterized Constuctor using this Keyword
		MyDateT(int day, int month, int year)
		{
			this.day = day;
			this.month = month;
			this.year = year;
			System.out.println("Parameterized Constuctor using this keyword!");
		}
	
	//printDate() method to print date object
		public void printDate()
		{
			System.out.println("Date : "+ day +"/"+month+"/"+year);
		}
}
