
public class Task17 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 1, 4, 3, 5, 2, 5 };
		boolean isUpperZigZaggy = true;

		for (int index = 1; index < array.length; index++) {
			if ((index % 2 == 0 && array[index] >= array[index - 1])
			 || (index % 2 != 0 && array[index] <= array[index - 1])) {
				isUpperZigZaggy = false;
			}
		}

		System.out.println("Array is upper zig-zaggy is " + isUpperZigZaggy);
	}

}
