package office;

public class AllWork {
	private static int MAX_NUM_TASKS = 10;
	private Task[] tasks;
	private int freePlasesForTasks;
	private int currentUnassignedTaskIndex;

	public AllWork() {
		tasks = new Task[MAX_NUM_TASKS];
		freePlasesForTasks = MAX_NUM_TASKS;
		currentUnassignedTaskIndex = 0;
	}

	public boolean isFull() {
		return freePlasesForTasks == 0;
	}

	public void startNewDay() {
		currentUnassignedTaskIndex = 0;
	}

	public boolean allJobsAreTaken() {
		return currentUnassignedTaskIndex >= MAX_NUM_TASKS;
	}

	public boolean addTask(Task toAdd) {
		if (toAdd != null && !isFull()) {
			tasks[MAX_NUM_TASKS - freePlasesForTasks] = toAdd;
			freePlasesForTasks--;
			return true;
		}
		return false;
	}

	public Task getNextTask() {
		if (allJobsAreTaken()) {
			return new Task();
		}

		for (int i = 0; i < tasks.length; i++) {
			currentUnassignedTaskIndex++;
			currentUnassignedTaskIndex %= MAX_NUM_TASKS;

			if (tasks[currentUnassignedTaskIndex].getWorkingHours() > 0) {
				break;
			}
		}
		return tasks[currentUnassignedTaskIndex];
	}

	public boolean isAllWorkDone() {
		for (int index = 0; index < tasks.length; index++) {
			if (tasks[index] != null && tasks[index].getWorkingHours() != 0) {
				return false;
			}
		}
		return true;
	}
}
