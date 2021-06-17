/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.shapes.circles;

import com.phoenix.shapes.Shape;

public class Circle extends Shape{

	//data members
	private float radius;
	
	//default constructor
	public Circle()
	{
		radius = 2.00f;
	}
	
	//parameterized constructor
	public Circle(float radius)
	{
		this.radius = radius;
	}
	
	//area
	public void calculateArea()
	{
		System.out.println("Area of Circle : "+MATH_PI*radius*radius);
	}
	
	//Perimeter
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of Circle : "+2*MATH_PI*radius);
	}
	
	
}
