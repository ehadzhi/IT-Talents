package Task2;

public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;

	public StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
		groupSubject = "";
	}

	public StudentGroup(String groupSubject) {
		this();
		if (groupSubject != null) {
			this.groupSubject = groupSubject;
		}
	}

	public void addStudent(Student student) {
		if (this.freePlaces > 0 && student != null) {
			this.students[this.students.length - this.freePlaces] = student;
			this.freePlaces--;
		}
	}

	public Student theBestStudent() {
		if (this.freePlaces >= 5) {
			System.out.println("There are no students in this group");
			return new Student();
		}
		Student theBest = students[0];
		for (int index = 1; index < students.length - freePlaces; index++) {
			if (theBest.getGrade() < students[index].getGrade()) {
				theBest = students[index];
			}
		}
		return theBest;
	}
	
	public void printStudentsInGroup(){
		for (int index = 0; index < students.length - freePlaces; index++) {
			System.out.print( "Student " + (index +1 ) + " : " );
			students[index].print();
		}
	}
}
