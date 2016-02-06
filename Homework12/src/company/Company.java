package company;

import java.util.Set;
import java.util.TreeSet;

import company.department.IDepartment;

public class Company implements ICompany {

	private String name;
	Set<IDepartment> departments;

	public Company(String name) throws CompanyException {
		setName(name);
		departments = new TreeSet<IDepartment>( (one,two) -> 
		one.getName().compareTo(two.getName()));
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void listDepartments() {
		for (IDepartment department : departments) {
			System.out.println(department);
			department.listEmployees();
		}

	}

	public void setName(String name) throws CompanyException {
		if (name != null && !name.equals("")) {
			this.name = name;
			return;
		}
		throw new CompanyException("Invalid name");
	}

	@Override
	public boolean addDepartment(IDepartment toAdd) {
		if(toAdd != null){
			return departments.add(toAdd);
		}
		return false;
	}

}
