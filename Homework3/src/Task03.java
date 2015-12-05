import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		int number;
		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		number = sc.nextInt();

		array[0] = number;
		array[1] = number;

		for (int index = 2; index < array.length; index++) {
			array[index] = array[index - 1] + array[index - 2];
		}

		System.out.println( Arrays.toString(array) );

		sc.close();

	}

}
