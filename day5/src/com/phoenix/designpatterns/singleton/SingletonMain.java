/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		//object of Sun
		Sun s1 = Sun.getInstance();
		s1.givesLight();
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		
		//object of Earth
		Earth e1 = Earth.getInstance();
		e1.createLife();
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		//object of Prime
		PrimeMinister pm1 = PrimeMinister.getInstance();
		pm1.serveNation();
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		President p1 = President.getInstance();
		p1.representNation();
	}

}
