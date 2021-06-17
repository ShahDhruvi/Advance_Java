/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package inheritance.emp.mgr;

import inheritance.emp.Employee;

public class Manager extends Employee {

	private double incentives;
	
	//default constructor
	public Manager()
	{
		super(1002,"Dhruvi",2850000.00);
		incentives = 2500.00;
	}
	
	//parameterized constructor
	public Manager(int empId, String name, double salary, double incentives)
	{
		super(empId,name,salary);
		this.incentives = incentives;
	}
	
	//show incentives method
	public void showIncentives()
	{
		System.out.println("Incentives: "+incentives);
	}
	
	//overriding display method of employee class 
	public void display()
	{
		super.display();
		//System.out.println("Incentives: "+incentives);
	}
	
	public String toString()
	{
		System.out.println(super.toString());
		return "Incentives: "+incentives;
	}
}
