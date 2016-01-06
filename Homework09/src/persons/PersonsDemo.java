package persons;

public class PersonsDemo {
	private static final int HOURS_OVERTIME = 2;
	private static final int NUM_PERSONS = 10;

	public static void main(String[] args) {
		Person[] persons = new Person[NUM_PERSONS];
		
		Person ivan = new Person("Ivan", 20, true);
		Person kiro = new Person("Kiril",17,true);
		
		Student yana = new Student("Yana", 27, false, 5.5d);
		Student ivo = new Student("Ivaylo", 32,true, 2.4d);
		
		Employee jambo = new Employee("Jambo", 39,true, 3d);
		Employee shefa = new Employee("Shefomir", 32,true,300d);
		
		persons[0] = ivan;
		persons[1] = kiro;
		persons[2] = yana;
		persons[3] = ivo;
		persons[4] = jambo;
		persons[5] = shefa;
		
		for (int index = 0; index < persons.length; index++) {
			if( persons[index] == null){
				continue;
			}
			persons[index].showPersonInfo();
			System.out.println();
		}
		
		System.out.println();
		for (int index = 0; index < persons.length; index++) {
			if( persons[index] == null || !persons[index].isEmployee()){
				continue;
			}
			System.out.println( persons[index].calculateOverTime(HOURS_OVERTIME) );
		}

//		Student stud = new Student();
//		stud.showStudentInfo();

	}

}
