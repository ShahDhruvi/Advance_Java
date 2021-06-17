/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package assignment3;

public class Array2DDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2D Array using new Keyword
		int arr1[][] = new int[2][3];
		arr1[0][0] = 5;
		arr1[0][1] = 7;
		arr1[0][2] = 9;
		arr1[1][0] = 2;
		arr1[1][1] = 15;
		arr1[1][2] = 6;
		
		System.out.println("Elemnts of 2D Array using new Keyword: ");
		//Display of array elements
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++)
				System.out.print(arr1[i][j]+" ");
			System.out.println();
		}
		
		//2D Array without using new keyword
		int arr2[][] = {
				{11,31,22,50},
				{42,75,80,95},
				{10,24,44,75},
				{17,15,28,65}
		};
		System.out.println("Elemnts of 2D Array without using new Keyword: ");
		//Display of array elements
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++)
				System.out.print(arr2[i][j]+" ");
			System.out.println();
		}
	}

}
