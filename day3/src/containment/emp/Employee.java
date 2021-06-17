/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package containment.emp;

import containment.date.MyDate;

public class Employee {

	private int empId;
	private String name;
	private MyDate birthDate;
	
	//default constructor
	public Employee()
	{
		/*
		 * empId =1; name ="Dhruvi"; birthDate = new MyDate();
		 */
		System.out.println("Default Constructor of Employee Class!");
	}
	
	//Parameterized constructor
	public Employee(int empId, String name, MyDate birthDate)
	{
		this.empId = empId;
		this.name = name;
		this.birthDate = birthDate;
		System.out.println("Parameterized Constructor of Employee Class!\n");
	}
	
	//setter for empId
	public void setEmpId(int e)
	{
		empId = e;
	}
	
	//getter for empId
	public int getEmpId()
	{
		return empId;
	}
	
	//setter for name
	public void setName(String n)
	{
		name = n;
	}
	
	//getter for name
	public String getName()
	{
		return name;
	}
	
	//setter method for Mydate
	public void setBirthDate(MyDate b)
	{
		birthDate = b;
	}
	
	//Getter Method for MyDate
	public MyDate getBirthDate()
	{
		return birthDate;
	}
	
	//display method
	public void display()
	{
		System.out.println("Employee Details: ");
		System.out.print("Employee Id: " +empId +"\t Name: " +name+ "\t Birth Date: "+birthDate);
	}
	
	//toSting method
	public String toString()
	{
		return "Employee Id: "+empId+"\t Name: "+name+"\t Birth Date: "+birthDate;
	}
}


