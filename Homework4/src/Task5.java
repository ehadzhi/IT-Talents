
public class Task5 {

	public static void main(String[] args) {
		int[][] array2D = { { 1, 2, 3, 10 }, { 4, 5, 6, 20 }, { 8, 9, 10, 20 }, { 50, 50, 50, 50 } };
		int maxSumRow = 0, maxSumCol = 0, currentSum;

		for (int row = 0; row < array2D.length; row++) {
			currentSum = 0;
			for (int col = 0; col < array2D[row].length; col++) {
				currentSum += array2D[row][col];
			}
			if (maxSumRow < currentSum) {
				maxSumRow = currentSum;
			}
		}

		for (int col = 0; col < array2D[0].length; col++) {
			currentSum = 0;
			for (int row = 0; row < array2D.length; row++) {
				currentSum += array2D[row][col];
			}
			if (maxSumCol < currentSum) {
				maxSumCol = currentSum;
			}
		}

		System.out.println("Max row sum = " + maxSumRow + ", max colimn sum = " + maxSumCol);

		System.out.print("Max row sum is ");
		if (maxSumRow > maxSumCol) {
			System.out.print(">");
		}
		if (maxSumRow == maxSumCol) {
			System.out.print("=");
		}

		if (maxSumRow < maxSumCol) {
			System.out.print("<");
		}

		System.out.print(" than max column sum.");
	}

}
