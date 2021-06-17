/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.living.wild;

import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

public class Tiger extends Animal implements Walkable {

	//implementing interface method
	public void jump() {
		System.out.println("Tiger Jumps!");
	}

	//implementing interface method
	public void move() {
		System.out.println("Tiger Moves!");
	}

	//implementing interface method
	public void run() {
		System.out.println("Tiger Runs!");
		
	}

	//implementing interface method
	public void walk() {
		System.out.println("Tiger Walks!");
		
	}
}
