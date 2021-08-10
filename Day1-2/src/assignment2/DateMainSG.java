/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package assignment2;

public class DateMainSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoking Default Constructor
		MyDateSG s1 = new MyDateSG();
		//invoking setter method for all data members
		s1.setDay(9);
		s1.setMonth(6);
		s1.setYear(2021);
		
		//invoking getter method
		System.out.println("Day: "+s1.getDay());
		System.out.println("Month: "+s1.getMonth());
		System.out.println("Year: "+s1.getYear());
		
		//calling printDate() method
		s1.printDate();
		
		//invoking parameterized constructor
		MyDateSG s2 = new MyDateSG(15,6,1995);
		
		//invoking getter method
		System.out.println("Displaying using Getter method!");
		System.out.println("Day: "+s2.getDay());
		System.out.println("Month: "+s2.getMonth());
		System.out.println("Year: "+s2.getYear());
		
		//calling printDate() method
		s2.printDate();
	}
}
