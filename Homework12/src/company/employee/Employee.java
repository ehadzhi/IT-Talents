package company.employee;

public class Employee implements IEmployee {

	private static int currentID = 0;
	private final int ID;
	private String name;
	private int age;
	private int salary;

	public Employee(String name, int age, int salary) throws EmployeeExeption {
		setName(name);
		setAge(age);
		setSalary(salary);
		
		ID = currentID++;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public int getSalary() {
		return salary;
	}

	@Override
	public int getID() {
		return ID;
	}

	public void setName(String name) throws EmployeeExeption {
		if (name != null && !name.equals("")) {
			this.name = name;
			return;
		}
		throw new EmployeeExeption("Invalid name");
	}

	public void setAge(int age) throws EmployeeExeption {
		if (age >= 18 && age <= 67) {
			this.age = age;
			return;
		}
		throw new EmployeeExeption("Ivalid age");
	}

	public void setSalary(int salary) throws EmployeeExeption {
		if (salary > 0) {
			this.salary = salary;
			return;
		}
		throw new EmployeeExeption("Ivalid salary");
	}

	@Override
	public String toString() {
		return "Emlployee [ID=" + ID + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
