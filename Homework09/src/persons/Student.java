package persons;

public class Student extends Person {
	private static final double SCORE_SUPREMUM = 6d;
	private static final double SCORE_INFINUM = 2d;
	private double score;

	// Last question from homework
	public Student(){
		super("Unnamed",0,false);
		this.score = SCORE_INFINUM;
	}

	public Student(String name, int age, boolean isMale,double score) {
		super(name, age, isMale);
		if(score >= SCORE_INFINUM && score <= SCORE_SUPREMUM){
			this.score = score;
		}
	}
	
	public void showStudentInfo(){
		super.showPersonInfo();
		System.out.format(" Score : %f %n", score);
	}

	@Override
	public void showPersonInfo(){
		this.showStudentInfo();
	}
	
}
