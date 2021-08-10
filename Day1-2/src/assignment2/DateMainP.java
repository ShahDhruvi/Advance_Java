/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package assignment2;

public class DateMainP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoking Default Constuctor
		MyDateP p1 = new MyDateP();
		p1.printDate();
		
		//invoking parameterized Constuctor
		MyDateP p2 = new MyDateP(29,6,2020);
		p2.printDate();

	}

}
