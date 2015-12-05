import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		int arrayLength, numDiv;
		int[] array;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array lenght : ");
		arrayLength = sc.nextInt();

		array = new int[arrayLength];

		for (int index = 0; index < array.length; index++) {
			System.out.print("Enter array[" + index + "] : ");
			array[index] = sc.nextInt();
		}
		
		numDiv = array[0];
		for (int index = 0; index < array.length; index++) {
			if( array[index] % 3 == 0 && array[index] < numDiv){
				numDiv = array[index];
			}
		}
		
		System.out.println("The smallest number in array divisable by 3 is : " + numDiv);
		
		sc.close();

	}

}
