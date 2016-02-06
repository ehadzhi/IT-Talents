package company;

import company.department.IDepartment;

public interface ICompany {

	String getName();
	
	boolean addDepartment(IDepartment toAdd);

	void listDepartments();

	//void listEmployees();
}
