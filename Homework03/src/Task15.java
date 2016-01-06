import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		double[] array;
		double max1 = 0, max2 = 0, max3 = 0;
		int arraySize;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array : ");
		arraySize = sc.nextInt();
		array = new double[arraySize];

		for (int index = 0; index < array.length; index++) {
			System.out.print("Enter array[" + index + "] = ");
			array[index] = sc.nextDouble();
		}

		for (int index = 0; index < array.length; index++) {
			if (max1 * max1 < array[index] * array[index]) {
				max1 = array[index];
			}
		}

		for (int index = 0; index < array.length; index++) {
			if ((max2 * max2 < array[index] * array[index]) 
			&& (array[index] * array[index] < max1 * max1)) {
				max2 = array[index];
			}
		}

		for (int index = 0; index < array.length; index++) {
			if ((max3 * max3 < array[index] * array[index]) 
			&& (array[index] * array[index] < max2 * max2)) {
				max3 = array[index];
			}
		}

		System.out.println("max1 = " + max1 + ", max2 = " + max2 + ", max3 = " + max3);
		sc.close();
	}

}
