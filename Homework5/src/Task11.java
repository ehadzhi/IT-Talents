public class Task11 {

	static void printArray(int[] array) {
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		printArray(array);
	}
}
