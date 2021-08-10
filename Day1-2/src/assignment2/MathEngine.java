/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

package assignment2;

public class MathEngine {
	
	//method with two int variables 
	public int multiply(int a , int b)
	{
		return (a*b);
	}
	
	//method with three int variables
	public void multiply(int a , int b , int c)
	{
		System.out.println("Multiplication of 3 int variables : " +(a*b*c));
	}
	
	//method with float and int variables
	public float multiply(float a, int b)
	{
		return (a*b);
	}
	
	//method with int and float variables
	public float multiply(int a, float b)
	{
		return (a*b);
	}
}
