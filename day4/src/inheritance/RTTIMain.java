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

public class RTTIMain {
	
	//showEmpInfo method
	public static void showEmpInfo(Employee emp)
	{
		emp.display();
		if(emp instanceof Manager)
			((Manager)emp).showIncentives();
		else if(emp instanceof WageEmp)
			((WageEmp)emp).calculateWage();	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object of manager
		System.out.println("Manager's Details: ");
		Manager m1 = new Manager(1001,"Abc",250000.00,23000);
		showEmpInfo(m1);
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		//object of WageEmp
		System.out.println("Wage Employee's Details: ");
		WageEmp w1 = new WageEmp(1111,"Xyz",200,150);
		showEmpInfo(w1);	
	}
}
