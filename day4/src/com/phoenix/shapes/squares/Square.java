/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.shapes.squares;

import com.phoenix.shapes.Shape;

public class Square extends Shape{
	
	//data member
	private int side;
	
	//default constructor
	public Square()
	{
		side = 4;
	}
	
	//parameterized constructor
	public Square(int side)
	{
		this.side = side;
	}
	
	//area
	public void calculateArea()
	{
		System.out.println("Area of Square : "+side*side);
	}
	
	//perimeter
		public void calculatePerimeter()
		{
			System.out.println("Perimeter of Square : "+4*side);
		}

}
