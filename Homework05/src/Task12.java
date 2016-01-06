
public class Task12 {

	static int[] buildArray(int num) {
		int[] array = new int[num];

		for (int index = 0; index < array.length; index++) {
			array[index] = index + 1;
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = buildArray(20);
		
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}

}
