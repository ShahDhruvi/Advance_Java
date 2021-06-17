/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package assignment3;

public class VarArgDemo {

	//Average method for calculating average
	public static double average(int... v)
    {
        double sum=0.0;
        for(int i:v)
            sum+=i;
        return (sum/v.length);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Average: " +average(1,2,3,4));
		
	}

}
