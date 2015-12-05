import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		int[] array = new int[7];
		int swap;
		Scanner sc = new Scanner(System.in);

		for (int index = 0; index < array.length; index++) {
			System.out.print("Enter array[" + index + "] : ");
			array[index] = sc.nextInt();
		}

		swap = array[0];
		array[0] = array[1];
		array[1] = swap;
		
		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];
		
		array[4] = array[4] * array[5];
		array[5] = array[4] / array[5];
		array[4] = array[4] / array[5];
		
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}

		sc.close();
	}

}
