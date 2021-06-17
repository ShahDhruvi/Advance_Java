/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.shapes.main;

import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.squares.Square;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reference of Abstract Shape class
		Shape s;
		
		System.out.println("Area Calculate using Abstract Methods");
		System.out.println("*****************************************************");
		System.out.println();
		
		//object of circle class
		s = new Circle(3.00f);
		s.calculateArea();
		System.out.println();
		s.calculatePerimeter();
		System.out.println();
		System.out.println("*****************************************************");
		
		//object of rectangle class
		s = new Rectangle(4,3);
		s.calculateArea();
		System.out.println();
		s.calculatePerimeter();
		System.out.println();
		System.out.println("*****************************************************");
		
		//object of circle class
		s = new Square(3);
		s.calculateArea();
		System.out.println();
		s.calculatePerimeter();
		System.out.println();
		
	}

}
