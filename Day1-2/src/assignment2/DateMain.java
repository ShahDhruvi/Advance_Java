/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

package assignment2;

public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating objects of MyDate Class
		MyDate m1 = new MyDate();
		MyDate m2 = new MyDate();
		//Calling functions 
		System.out.println("Printing Date of First object:");
		m1.initDate(8, 6, 2021);
		m1.printDate();
		System.out.println("Printing Date of Second object:");
		m2.initDate(16,10,1999);
		m2.printDate();
	}

}
