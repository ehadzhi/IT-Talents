
public class Task14 {

	public static void main(String[] args) {
		double[] array = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 }, arrayInRange;
		int numbersInRange = 0;

		for (int index = 0; index < array.length; index++) {
			if (array[index] < 2.99 && array[index] > -2.99) {
				numbersInRange++;
			}
		}

		arrayInRange = new double[numbersInRange];

		for (int index1 = 0, index2 = 0; index1 < array.length; index1++) {
			if (array[index1] < 2.99 && array[index1] > -2.99) {
				arrayInRange[index2] = array[index1];
				index2++;
			}
		}

		for (int index = 0; index < arrayInRange.length; index++) {
			System.out.print(arrayInRange[index] + " ");
		}

	}

}
