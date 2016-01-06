import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		int[] array;
		int arraySize, swap;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array : ");
		arraySize = sc.nextInt();

		array = new int[arraySize];

		for (int index = 0; index < array.length; index++) {
			System.out.print("Enter array[" + index + "] : ");
			array[index] = sc.nextInt();
		}

		for (int index = 0; index < (array.length / 2); index++) {
			swap = array[index];
			array[index] = array[array.length - index - 1];
			array[array.length - index - 1] = swap;
		}

		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		sc.close();
	}

}
