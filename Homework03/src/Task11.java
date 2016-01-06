import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		int[] array = new int[7];

		Scanner sc = new Scanner(System.in);

		for (int index = 0; index < array.length; index++) {
			System.out.print("Enter array[" + index + "] : ");
			array[index] = sc.nextInt();
		}

		for (int index = 0; index < array.length; index++) {
			if (array[index] % 5 == 0 && array[index] > 5) {
				System.out.print(array[index] + " ");
			}
		}

		sc.close();

	}

}
