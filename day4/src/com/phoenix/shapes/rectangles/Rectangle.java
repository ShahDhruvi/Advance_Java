/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.shapes.rectangles;

import com.phoenix.shapes.Shape;

public class Rectangle extends Shape{
	
	//data members
	private int length;
	private int breadth;
	
	//default constructor
	public Rectangle()
	{
		length = 2;
		breadth = 3;
	}
	
	//parameterized constructor
	public Rectangle(int length , int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	//area
	public void calculateArea()
	{
		System.out.println("Area of Rectangle : "+length*breadth);
	}
	
	//perimeter
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of Rectangle : "+2*(length+breadth));
	}
}
