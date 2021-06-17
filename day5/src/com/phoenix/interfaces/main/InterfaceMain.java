/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Movable;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.vehicles.cars.Car;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reference of movable interface
		Movable mv1;
		
		System.out.println("*************************************");
		
		//object of Earth 
		mv1 = new Earth();
		Earth e1 =  (Earth) mv1;
		
		//method of Earth
		e1.setNoOfMoons(1);
		if(e1.supportsLife())
			System.out.println("Earth Supports Life!");
		else
			System.out.println("Earth Does not Supports Life!");
		System.out.println(e1.toString());
		e1.move();
		e1.rotate();
		e1.revolve();
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		//object of Jupiter 
		mv1 = new Jupiter();
		Jupiter j1 =  (Jupiter) mv1;
		
		//method of Jupiter
		j1.setNoOfMoons(79);
		if(j1.supportsLife())
			System.out.println("Jupiter Supports Life!");
		else
			System.out.println("Jupiter Does not Supports Life!");
		System.out.println(j1.toString());
		j1.move();
		j1.rotate();
		j1.revolve();
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		//object of Tiger 
		mv1 = new Tiger();
		Tiger t1 = (Tiger) mv1;
		
		//method of Tiger
		t1.move();
		t1.walk();
		t1.run();
		t1.jump();
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		//object of Cat 
		mv1 = new Cat();
		Cat c1 = (Cat) mv1;
		
		//method of Cat
		c1.move();
		c1.walk();
		c1.run();
		c1.jump();
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		//object of Car 
		mv1 = new Car();
		Car cr1 = (Car) mv1;
		
		//method of Car
		cr1.start();
		cr1.move();
		cr1.run();
		cr1.stop();
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		//object of Human Robot 
		mv1 = new HumanRobot();
		HumanRobot hr1 = (HumanRobot) mv1;
		
		//method of Human Robot
		hr1.move();
		hr1.walk();
		hr1.run();
		hr1.jump();
		hr1.processData();
		hr1.senseInfo();
		hr1.useArtificialIntelligence();
	}

}
