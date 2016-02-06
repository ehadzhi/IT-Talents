package company.department;

import java.util.Set;
import java.util.TreeSet;

import company.employee.IEmployee;

public class Department implements IDepartment {

	private String name;
	Set<IEmployee> employees;

	public Department(String name) throws DepartmentExeption{
		setName(name);
		employees = new TreeSet<IEmployee>( (one,two) -> 
		one.getID() - two.getID());
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void listEmployees() {
		System.out.println();
		for (IEmployee employee : employees) {
			System.out.println( "  " + employee);
		}
		System.out.println();
	}

	public void setName(String name) throws DepartmentExeption{
		if (name != null && !name.equals("")) {
			this.name = name;
			return;
		}
		throw new DepartmentExeption("Invalid name.");
	}

	@Override
	public boolean addEmployee(IEmployee toAdd) {
		if( toAdd != null){
			return employees.add(toAdd);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}

}
