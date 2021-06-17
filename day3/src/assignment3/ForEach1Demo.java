/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package assignment3;

public class ForEach1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array using new keyword
		double a1[] = new double[3];
		a1[0] = 2.00;
		a1[1] = 4.00;
		a1[2] = 6.50;
		
		//display array 
		System.out.print("Elements of Double array: ");
		for(double ele: a1)
		    System.out.print(ele+" "); 
		System.out.println();
		
		//Array without using new keyword
		float a2[] = {2.5f,1.0f,3.9f,4.7f,5.0f};
		System.out.print("Elements of Float array: ");
		//display array 
		for(float ele: a2)
		    System.out.print(ele+" "); 
		System.out.println();
		
		//String array using new keyword
		String a3[] = new String[4];
		a3[0] ="Rose";
		a3[1] ="Lotus";
		a3[2] ="SunFlower";
		a3[3] ="Tulip";
		System.out.print("Elements of String array of Flower: ");
		//display array 
		for(String ele: a3)
		    System.out.print(ele+" "); 
		System.out.println();
		
		//Array without using new keyword
		String a4[] = {"India","Canada","Japan","Germany","France"};
		System.out.print("Elements of String array of Country: ");
		//display array 
		for(String ele: a4)
		    System.out.print(ele+" "); 
		System.out.println();

	}

}
