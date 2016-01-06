import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int[] array = new int[7];
		double average = 0;
		int closestIndex = 0;

		Scanner sc = new Scanner(System.in);

		for (int index = 0; index < array.length; index++) {
			System.out.print("Enter array[" + index + "] : ");
			array[index] = sc.nextInt();
		}

		for (int index = 0; index < array.length; index++) {
			average += array[index];
		}
		average /= array.length;

		for (int index = 0; index < array.length; index++) {
			if ((average - array[index])*(average - array[index])
					< (average - array[closestIndex])*(average - array[closestIndex])) {
				closestIndex = index;
			}
		}
		System.out.println("Average = " + average + " closest index = " + closestIndex + " closest value = "
				+ array[closestIndex]);

		sc.close();

	}

}
