/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package assignment3;

public class ForEach2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring 2D Array
		int a1[][] = new int[3][2];
		
		//intializing Array
		a1[0][0] = 1;
		a1[0][1] = 2;
		a1[1][0] = 3;
		a1[1][1] = 4;
		a1[2][0] = 5;
		a1[2][1] = 6;
		
		//Display of Array
		System.out.println("Elements of 2D array using new keyword: ");
		for(int[] ele:a1){
		    for(int i:ele)
		        System.out.print(i + " ");
		    System.out.println();
		}
		
		//2D Array without new Kewyord
		int a2[][] = {
		    {10,15,20,25},
		    {30,35,40,45},
		};
		
		//Displaying Array
		System.out.println("Elements of 2D array without using new keyword: ");
		for(int[] ele:a2){
		    for(int i:ele)
		        System.out.print(i + " ");
		    System.out.println();
		}
	}
}
