package task3;

import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {
	
	private static Queue<Task> queue = new LinkedList<Task>();
	private static void push(Task toPush){
		queue.offer(toPush);
	}
	
	public static void main(String[] args) {
		push(new Task() {
			@Override
			public void doWork() {
				System.out.println("work work 1");
			}
		});
		push(() -> System.out.println("work work 2"));
		push(() -> System.out.println("work work 3"));
		push(() -> System.out.println("work work 4"));
		
		queue.forEach(task -> task.doWork());
	}

}
