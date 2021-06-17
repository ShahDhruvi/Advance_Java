/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.factory.main;

import com.phoenix.designpatterns.factory.CarFactory;
import com.phoenix.designpatterns.factory.cars.Car;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//taking input of car type from user
		String s = args[0];
		
		//object of car
		Car car = CarFactory.newCar(s);
		car.start();
		car.run();
		car.stop();
	}

}
