package Task2;

public class College {

	public static void main(String[] args) {
		Student gosho = new Student("Gosho", "KN", 21, false);
		gosho.setGrade(2.0f);
		Student ivan = new Student("Ivan", "SI", 20, false); 
		Student umen = new Student("Naum", "KN", 19, false);
		umen.setGrade(5.9f);
		Student typ = new Student("Gucci", "KN", 21, false);
		Student mariika = new Student("Ivan", "SI", 21, false);
				
		StudentGroup algebra = new StudentGroup("Algebra");		
		algebra.addStudent(gosho);
		algebra.addStudent(ivan);
		algebra.addStudent(umen);
		algebra.addStudent(typ);
		algebra.addStudent(mariika);
		
		algebra.printStudentsInGroup();
		
		algebra.theBestStudent().print();
	}

}
