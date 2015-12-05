import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		int[] array, arrayTwo;
		int arraySize;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array : ");
		arraySize = sc.nextInt();

		array = new int[arraySize];

		for (int index = 0; index < array.length; index++) {
			System.out.print("Enter array[" + index + "] = ");
			array[index] = sc.nextInt();
		}

		arrayTwo = new int[array.length];

		arrayTwo[0] = array[0];
		arrayTwo[arrayTwo.length - 1] = array[array.length - 1];
		for (int index = 1; index < (arrayTwo.length - 1); index++) {
			arrayTwo[index] = array[index - 1] + array[index + 1];
		}

		for (int index = 0; index < arrayTwo.length; index++) {
			System.out.print(arrayTwo[index] + " ");
		}

		sc.close();
	}

}
