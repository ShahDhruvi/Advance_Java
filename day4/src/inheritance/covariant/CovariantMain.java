/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package inheritance.covariant;

import inheritance.emp.EmployeeData;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

public class CovariantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData ed1 = new EmployeeData();
		ed1.getEmployee().display();
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		//manager
		ManagerData md1 = new ManagerData();
		md1.getEmployee().display();
		md1.getEmployee().showIncentives();
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		//WageEmp
		WageEmpData wd1 = new WageEmpData();
		wd1.getEmployee().display();
		wd1.getEmployee().calculateWage();
	}

}
