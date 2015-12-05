import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		int arrayLength;
		int[] array;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array lenght : ");
		arrayLength = sc.nextInt();

		array = new int[arrayLength];

		for (int index = 0; index < array.length; index++) {
			System.out.print("Enter array[" + index + "] : ");
			array[index] = sc.nextInt();
		}

		int[] mirrorArray = new int[2 * (array.length)];

		for (int index = 0; index < array.length; index++) {
			mirrorArray[index] = array[index];
			mirrorArray[(mirrorArray.length - 1) - index] = array[index];
		}

		for (int index = 0; index < mirrorArray.length; index++) {
			System.out.print(mirrorArray[index] + " ");
		}

		sc.close();
	}

}
