package company.department;

import company.employee.IEmployee;

public interface IDepartment {
	
	String getName();
	
	void listEmployees();
	
	boolean addEmployee(IEmployee toAdd);
}
