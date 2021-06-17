/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 10-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package inheritance.emp.mgr;

import inheritance.emp.EmployeeData;

public class ManagerData extends EmployeeData {
		public Manager getEmployee()
		{
			return new Manager();
		}
}
