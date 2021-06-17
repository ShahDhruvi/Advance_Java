/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package assignment3;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1D Array using new keyword
		int arr1[] = new int[5];
		//intializing elements of array
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=80;
		arr1[3]=30;
		arr1[4]=60;
		//displaying array 
		System.out.print("Elements of Array 1: ");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i] + " ");
		System.out.println();
		
		//1D int array without using new keyword
		int arr2[] = {1,2,5,6,8,9,12,22,26,50};
		//displaying array 
		System.out.print("Elements of Array 2: ");
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i] + " ");
		System.out.println();
		
		//1D array of string using new keyword
		String arr3[] = new String[3];
		//intializing elements of array
		arr3[0]="Ahmedabad";
		arr3[1]="Rajkot";
		arr3[2]="Surat";
		//displaying array 
		System.out.print("Elements of Array 3: ");
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i] + " ");
		System.out.println();
		
		//1D int array of string without using new keyword
		String arr4[] = {"Painting","Reading","Swimming","Music"};
		//displaying array 
		System.out.print("Elements of Array 4: ");
		for(int i=0;i<arr4.length;i++)
			System.out.print(arr4[i] + " ");
		System.out.println();
		
	}

}
