package office;

public class OfficeDemo {

	public static void main(String[] args) {
		AllWork tasks = new AllWork();

		tasks.addTask(new Task("Build important project", 50));
		tasks.addTask(new Task("Build simple project ", 15));
		tasks.addTask(new Task("Talk to clients", 20));
		tasks.addTask(new Task("Build the other simple progect", 9));
		tasks.addTask(new Task("Refactor old codebase", 23));
		tasks.addTask(new Task("Take trash out", 1));
		tasks.addTask(new Task("Write unit tests", 17));
		tasks.addTask(new Task("Debug", 50));
		tasks.addTask(new Task("Add new funcionality to old codebase", 1));
		tasks.addTask(new Task("Design UML", 19));

		Employee[] workSquad = new Employee[4];

		// cash money work squad = CMWS
		Employee drizzy = new Employee("Aubrey");
		workSquad[0] = drizzy;
		Employee weezy = new Employee("Lil Wayne");
		workSquad[1] = weezy;
		Employee yeezy = new Employee("Kanye");
		workSquad[2] = yeezy;
		Employee kdot = new Employee("Kendrik");
		workSquad[3] = kdot;

		for (int index = 0; index < workSquad.length; index++) {
			workSquad[index].setAllWork(tasks);
		}

		int day = 1;
		while (!tasks.isAllWorkDone()) {
			System.out.println("Day number " + day + "\n");
			tasks.startNewDay();
			for (int index = 0; index < workSquad.length; index++) {
				workSquad[index].startWorkingDay();
			}

			for (int index = 0; index < workSquad.length; index++) {
				workSquad[index].setCurrentTask(tasks.getNextTask());
				workSquad[index].work();
			}
			day++;
			System.out.println();
		}

	}

}
