/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package inheritance.emp;

public class WageEmp extends Employee{
	//data members
	private int noOfHours;
	private float ratePerHour;
	
	//default Constructor
	public WageEmp() {
		super(1112,"aac");
		noOfHours = 150;
		ratePerHour = 250;
	}
	
	//parameterized constructor
	public WageEmp(int empId,String name,int hours,float rate) {
		super(empId,name);
		this.noOfHours = hours;
		this.ratePerHour = rate;
	}

	//Calculate Wage of employee
	public void calculateWage() {
		float wage = noOfHours*ratePerHour;
		System.out.println("Wage: "+wage);
	}
	
	//override display method
	public void display() {
		super.display();
		System.out.println("No of Hours of working: "+noOfHours);
		System.out.println("Rate Per Hour: "+ratePerHour);
		//System.out.println("Wage: "+wage);
		//calculateWage();
	}
	
	//toString method
	public String toString()
	{
		System.out.println(super.toString());
		return "No of Hours of working: "+noOfHours+"\nRate Per Hour: "+ratePerHour+"\nWage: "+(noOfHours*ratePerHour);
	}
	
	
	
}
