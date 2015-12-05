
public class Task13 {

	static int[] concArrays(int[] array1, int[] array2) {
		int[] array = new int[array1.length + array2.length];
		
		for(int index = 0;index<array1.length;index++){
			array[index] = array1[index];
		}
		for(int index = 0;index<array2.length;index++){
			array[index + array1.length] = array2[index];
		}
		
		return array;
	}

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4},array2 = {4,5,6};
		
		int[] array = concArrays(array1, array2);
		
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}

}
