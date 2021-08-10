/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 8-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

package assignment2;

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of MathEngine class
		MathEngine m1 = new MathEngine();
		//Calling overloaded method multiply using different signatures
		System.out.println("Multiplication of 2 int variables : " + m1.multiply(2,5));
		m1.multiply(2,3,5);
		System.out.println("Multiplication of float and int variables : " + m1.multiply(2.3f,5));
		System.out.println("Multiplication of int and float variables : " + m1.multiply(2,5.5f));
	}

}
