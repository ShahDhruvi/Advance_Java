/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package inheritance.emp;

public class Employee {
	//data members 
	private int empId;
	private String name;
	private double salary;
		
	//default Constructor
	public Employee()
	{
		empId = 1000;
		name = "Shah";
		salary = 450000.0;
	}
	
	//Parameterized constructor
	public Employee(int empId, String name)
	{
		this.empId = empId;
		this.name = name;
	}
	
	public Employee(int empId, String name, double salary)
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	//display method
	public void display()
	{
		System.out.println("Employee Id: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	
	
	/*
	 * public String toString() { return "Employee Id: "+empId+"\tName: "+name; }
	 */
	
	//toString method
	public String toString() 
	{
		return "Employee Id: "+this.empId+"\tName: "+this.name+"\tSalary: "+this.salary;
	}
}

