package persons;

public class Person {
	protected String name;
	protected int age;
	protected boolean isMale;

	public Person(String name, int age, boolean isMale) {
		if (name != null && !name.equals("")) {
			this.name = name;
		}
		if (age >= 0) {
			this.age = age;
		}
		this.isMale = isMale;
	}
	
	public void showPersonInfo(){
		System.out.format(" Name : %s %n Age : %d %n Is male : %b %n",name,age,isMale);
	}
	
	public boolean isEmployee(){
		return false;
	}
	
	protected double calculateOverTime(double hours) {
		return 0;
	}
}
