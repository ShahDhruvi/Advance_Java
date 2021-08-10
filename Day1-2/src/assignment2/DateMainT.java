/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package assignment2;

public class DateMainT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoking Default Constructor
		MyDateT t1 = new MyDateT();
		t1.printDate();
				
		//invoking parameterized Constructor
		MyDateT t2 = new MyDateT(16,10,2003);
		t2.printDate();
	}

}
