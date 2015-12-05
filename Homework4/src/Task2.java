import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int[][] array2D;
		int size;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the sqare two dimmensional array : ");
		size = sc.nextInt();

		array2D = new int[size][size];

		for (int row = 0; row < array2D.length; row++) {
			for (int col = 0; col < array2D[row].length; col++) {
				System.out.print("Enter array[" + row + "][" + col + "] = : ");
				array2D[row][col] = sc.nextInt();
			}

		}

		for (int row = 0; row < array2D.length; row++) {
			for (int col = 0; col < array2D[row].length; col++) {
				System.out.print(array2D[row][col] + " ");
			}
			System.out.println();
		}

		for (int row = 0; row < array2D.length; row++) {
			System.out.print(array2D[row][row]);
		}

		System.out.println();
		for (int row = 0; row < array2D.length; row++) {
			System.out.print(array2D[row][array2D.length - row - 1]);
		}
		
		sc.close();
	}

}
