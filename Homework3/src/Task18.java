
public class Task18 {

	public static void main(String[] args) {
		int[] arrayOne = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] arrayTwo = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] arrayThree;
		int arrayThreeSize;

		if (arrayOne.length < arrayTwo.length) {
			arrayThreeSize = arrayOne.length;
		} else {
			arrayThreeSize = arrayTwo.length;
		}

		arrayThree = new int[arrayThreeSize];

		for (int index = 0; index < arrayThree.length; index++) {
			if (arrayOne[index] >= arrayTwo[index]) {
				arrayThree[index] = arrayOne[index];
			} 
			else {
				arrayThree[index] = arrayTwo[index];
			}
		}

		for (int index = 0; index < arrayThree.length; index++) {
			System.out.print(arrayThree[index] + " ");
		}

	}

}
