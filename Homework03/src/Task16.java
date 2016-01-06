
public class Task16 {

	public static void main(String[] args) {
		double[] array = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 };

		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}

		for (int index = 0; index < array.length; index++) {
			if( array[index] < -0.231 ){
				array[index] = ( 41.25 + (index+1)*(index+1));
			}
			else{
				array[index] = ( array[index]*(index+1));
			}
		}
		
		System.out.println();
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}

}
