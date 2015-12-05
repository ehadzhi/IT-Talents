
public class Task7 {

	public static void main(String[] args) {
		int[][] array2D = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };

		int currentRowSum = 0, allRowsSum = 0, row = 0, col = 0;

		int length = array2D.length * array2D[0].length;
		for (int index = 0; index < length; index++) {
			row = index / array2D[0].length;
			col = index % array2D[0].length;
			if (col == 0) {
				currentRowSum = 0;
			}
			if ((row + col) % 2 == 0) {
				System.out.print(array2D[row][col] + " ");
				currentRowSum += array2D[row][col];
			}
			if (col == array2D[0].length - 1) {
				System.out.println(" sum = " + currentRowSum);
				allRowsSum += currentRowSum;
			}
		}

		System.out.println("The sum of all the rows = " + allRowsSum);

	}

}
