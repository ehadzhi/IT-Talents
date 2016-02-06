package company;

import company.department.Department;
import company.department.DepartmentExeption;
import company.department.IDepartment;
import company.employee.Employee;
import company.employee.EmployeeExeption;
import company.employee.IEmployee;

public class CompanyDemo {

	public static void main(String[] args) throws CompanyException, EmployeeExeption, DepartmentExeption {
			ICompany company = new Company("Nashta firma");
			
			IEmployee petko = new Employee("Petkan", 20, 1000);
			IEmployee samara = new Employee("Samara", 50, 6000);
			
			IDepartment HR = new Department("HR");
			IDepartment IT = new Department("IT");
			IDepartment cleaners = new Department("Cleaners");
			
			company.addDepartment(HR);
			company.addDepartment(IT);
			company.addDepartment(cleaners);
			
			HR.addEmployee(petko);
			HR.addEmployee(new Employee("Ainura", 28, 500));
			IT.addEmployee(new Employee("Mara", 22, 3000));
			IT.addEmployee(samara);
			cleaners.addEmployee(new Employee("Ainura", 28, 10000));
			IT.addEmployee(new Employee("Ainura", 28, 900));
			cleaners.addEmployee(new Employee("Ignat", 19, 480));
			
			company.listDepartments();
	}

}
