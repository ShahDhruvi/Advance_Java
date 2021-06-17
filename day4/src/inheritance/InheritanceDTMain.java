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

public class InheritanceDTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//super class reference
		Employee e1;
		
		//manager 
		System.out.println("Manager's Details:");
		System.out.println();
		e1 = new Manager(1008,"Pqr",350000.00,27000.0);
		e1.display();
		((Manager)e1).showIncentives();
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		//WageEmp
		System.out.println("Wage Employee's Details:");
		System.out.println();
		e1 = new WageEmp(1114,"xyz",200,316);
		e1.display();
		((WageEmp)e1).calculateWage();
		
	}

}
