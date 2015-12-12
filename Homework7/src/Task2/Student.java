package Task2;

public class Student {
	private String name;
	private String subject;
	private float grade;
	private int yearInCollege;
	private int age;
	private boolean hasDegree;
	private float money;

	public Student() {
		grade = 4.0f;
		yearInCollege = 1;
		hasDegree = false;
		money = 0;
		name = "";
		subject = "";
	}

	public Student(String name, String subject, int age, boolean hasDegree) {
		this();
		if (name != null) {
			this.name = name;
		} else {
			this.name = "Unnamed";
		}
		if (subject != null) {
			this.subject = subject;
		} else {
			this.subject = "Unnamed";
		}
		if (age > 0) {
			this.age = age;
		}
		this.hasDegree = hasDegree;
	}

	public void upYear() {
		if (this.hasDegree) {
			System.out.println(this.name + " is not in college.");
		}
		this.yearInCollege++;
		this.hasDegree = this.yearInCollege >= 4;
	}

	public double receiveScholarship(float min, float amount) {
		if (this.age < 30 && this.grade >= min) {
			this.money += amount;
		}
		return this.money;
	}

	public float getGrade() {
		return grade;
	}
	
	public void print(){
		System.out.println(this.name + " " + subject + " grade: " + grade + " years in college: " 
				+ yearInCollege + " age: " + age + " has a degree: " + hasDegree); 
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}
}
