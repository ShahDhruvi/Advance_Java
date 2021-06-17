/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 9-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package containment;

import containment.emp.Employee;
import containment.date.MyDate;

public class ContainmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object of Employee class using default constructor
		Employee e1 = new Employee();
		
		//object of MyDate class using default constructor
		MyDate d1 = new  MyDate();
		
		//initializing variables using setter method of employee class
		e1.setEmpId(1234);
		e1.setName("abc");
		e1.setBirthDate(d1);
		
		//Display Employee class variable using getter method
		System.out.println("Employee ID: "+e1.getEmpId());
		System.out.println("Employee Name: "+e1.getName());
		System.out.println("Employee Birth Date: "+e1.getBirthDate());
		
		System.out.println();
		//invoking toString method of Employee class 
		System.out.println("Employee Details: \n"+e1);
		
		System.out.println();
		System.out.println();
		
		
		//MyDate class object using parameterized constructor
		MyDate d2 = new MyDate(10,6,2000);
		
		//object of Employee class using Parameterized constructor
		Employee e2 = new Employee(2345,"xyz",d2);
		
		//invoking Display Method
		e2.display();
	}

}
