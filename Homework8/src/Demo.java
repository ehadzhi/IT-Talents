
public class Demo {

	public static void main(String[] args) {
		Task digAHole = new Task("Dig a hole",9);
		Employee ivan = new Employee("Bai Ivan");
		ivan.setCurrentTask(digAHole);
		
		ivan.work();
	}

}
