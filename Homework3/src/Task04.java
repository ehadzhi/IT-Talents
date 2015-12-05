import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		int arrLength;
		int[] array;
		boolean arrayIsMirrored = true;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array length : ");
		arrLength = sc.nextInt();

		array = new int[arrLength];

		for (int index = 0; index < array.length; index++) {
			System.out.print("Enter array[" + index + "] = ");
			array[index] = sc.nextInt();
		}

		for (int index = 0; index < (array.length / 2); index++) {
			if (array[index] != array[(array.length - 1) - index]) {
				arrayIsMirrored = false;
			}
		}

		System.out.println("Array is mirrored is " + arrayIsMirrored);
		sc.close();
	}

}
