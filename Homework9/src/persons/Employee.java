package persons;

public class Employee extends Person {

	private static final int ADULT_AGE = 18;
	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		if (daySalary >= 0) {
			this.daySalary = daySalary;
		}
	}
	
	@Override
	public double calculateOverTime(double hours) {
		if (this.age < ADULT_AGE) {
			return 0;
		}
		return hours * (1.5d) * daySalary;
	}

	public void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.format(" Daily salary is %f %n", daySalary);
	}
	
	@Override
	public void showPersonInfo(){
		this.showEmployeeInfo();
	}
	
	@Override
	public boolean isEmployee(){
		return true;
	}

}
