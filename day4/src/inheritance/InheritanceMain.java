/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class InheritanceMain extends Employee{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1002,"Dhruvi",2850000.00);
		
		System.out.print("Employee Details: ");
		e1.display();
		System.out.println();
		System.out.println("Details Using toString: ");
		System.out.println(e1.toString());
		
		System.out.println();
		//manager using default constructor
		System.out.println("Manager's details:");
		Manager m1 = new Manager();
		m1.showIncentives();
		m1.display();
		System.out.println();
		System.out.println("Details Using toString: ");
		//System.out.println(e1.toString());
		System.out.println(m1.toString());
		
		//manager using parameterized constructor
		System.out.println();
		System.out.println("Manager's details of parameterized constructor:");
		Manager m2 = new Manager(1000,"Abc",25000.00,1500.00);
		m2.showIncentives();
		m2.display();
		System.out.println();
		System.out.println("Details Using toString: ");
		System.out.println(m2.toString());
		
		System.out.println();
		//wageemp using default constructor
		System.out.println("Wage Employee's details:");
		WageEmp w1 = new WageEmp();
		w1.calculateWage();
		w1.display();
		System.out.println();
		System.out.println("Details Using toString: ");
		//System.out.println(e1.toString());
		System.out.println(w1.toString());
		
		//manager using parameterized constructor
		System.out.println();
		System.out.println("Wage Employee's details of parameterized constructor:");
		WageEmp w2 = new WageEmp(1111,"xyz",180,200);
		w2.calculateWage();
		w2.display();
		System.out.println();
		System.out.println("Details Using toString: ");
		System.out.println(w2.toString());
		
	}
}
